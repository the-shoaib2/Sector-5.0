import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

// Interface for user actions
interface IUserActions {
    void displayMenu();
    void deposit(double amount);
    void withdraw(double amount);
    void viewBalance();
}

// Abstract User class (Abstraction, Inheritance)
abstract class User implements IUserActions {
    protected String userID, name, phone, dob, nid, fatherName, motherName, address;
    private static int userCounter = 0; // static counter for all users

    public User(String name, String phone, String dob, String nid, String fatherName, String motherName, String address) {
        this.userID = String.format("%05d", ++userCounter); // e.g., 00001, 00002, ...
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.nid = nid;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
    }

    public String getUserID() { return userID; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getDob() { return dob; }
    public String getNid() { return nid; }
    public String getFatherName() { return fatherName; }
    public String getMotherName() { return motherName; }
    public String getAddress() { return address; }
}

// Account class (Encapsulation)
class Account {
    private String accountNumber;
    private double balance;

    public Account(double initialBalance) {
        this.accountNumber = "ACC" + (System.currentTimeMillis() % 100000000000L); // auto-generated
        this.balance = initialBalance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) throws Exception {
        if (amount > balance) throw new Exception("Insufficient balance");
        balance -= amount;
    }
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
}

// FileManager for user data and transactions
class FileManager {
    private static final String DB_PATH = "database/user/";

    public static void saveUser(Customer customer) {
        try {
            File dir = new File(DB_PATH);
            if (!dir.exists()) dir.mkdirs();
            String filename = DB_PATH + customer.getAccount().getAccountNumber() + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                writer.write(customer.toDataString());
            }
            appendToAllUsersFile(customer);
        } catch (IOException e) {
            System.out.println("User file write error: " + e.getMessage());
        }
    }

    public static void appendToAllUsersFile(Customer customer) {
        String allUsersFile = DB_PATH + "all_users.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(allUsersFile, true))) {
            writer.write(customer.toDataString());
            writer.write("\n----------------------\n");
        } catch (IOException e) {
            System.out.println("All users file write error: " + e.getMessage());
        }
    }

    public static void exportTransaction(String accNumber, String details) {
        try {
            File dir = new File(DB_PATH);
            if (!dir.exists()) dir.mkdirs();
            String filename = DB_PATH + accNumber + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                writer.write(details + "\n");
            }
        } catch (IOException e) {
            System.out.println("Transaction file write error: " + e.getMessage());
        }
    }
}

// Customer class (Polymorphism)
class Customer extends User {
    private Account account;

    public Customer(String name, String phone, String dob, String nid, String fatherName, String motherName, String address, double initialBalance) {
        super(name, phone, dob, nid, fatherName, motherName, address);
        this.account = new Account(initialBalance);
    }

    public Account getAccount() { return account; }

    @Override
    public void displayMenu() {
        System.out.println("\n--- Customer Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. View Balance");
        System.out.println("4. Logout");
    }

    @Override
    public void deposit(double amount) {
        account.deposit(amount);
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        FileManager.exportTransaction(account.getAccountNumber(), name + " deposited: " + amount + " at " + time);
    }

    @Override
    public void withdraw(double amount) {
        try {
            account.withdraw(amount);
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            FileManager.exportTransaction(account.getAccountNumber(), name + " withdrew: " + amount + " at " + time);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public String toDataString() {
        return "UserID: " + userID + "\nName: " + name + "\nPhone: " + phone + "\nDOB: " + dob +
                "\nNID: " + nid + "\nFather: " + fatherName + "\nMother: " + motherName +
                "\nAddress: " + address + "\nAccount: " + account.getAccountNumber() +
                "\nBalance: " + account.getBalance();
    }
}

// Employee class (example, can be expanded)
class Employee extends User {
    public Employee(String name, String phone, String dob, String nid, String fatherName, String motherName, String address) {
        super(name, phone, dob, nid, fatherName, motherName, address);
    }
    @Override public void displayMenu() { System.out.println("Employee menu..."); }
    @Override public void deposit(double amount) {}
    @Override public void withdraw(double amount) {}
    @Override public void viewBalance() {}
}

// Bank class (Composition)
class Bank {
    private String bankName;
    private List<Customer> customers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Bank(String bankName) { this.bankName = bankName; }

    public void addCustomer(Customer c) { customers.add(c); }
    public Customer findCustomerByName(String name) {
        for (Customer c : customers) if (c.getName().equalsIgnoreCase(name)) return c;
        return null;
    }
    public List<Customer> getCustomers() { return customers; }
    public String getBankName() { return bankName; }
}

public class BMS {
    private static Bank bank = new Bank("SWITCH BANK");

    public static void openNewAccount(Scanner sc) {
        System.out.println("\n=== Open a New Account ===");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = sc.nextLine();
        System.out.print("Enter NID Number: ");
        String nid = sc.nextLine();
        System.out.print("Enter Father's Name: ");
        String father = sc.nextLine();
        System.out.print("Enter Mother's Name: ");
        String mother = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Initial Deposit Amount: ");
        double initialBalance = sc.nextDouble();
        sc.nextLine(); // consume newline

        Customer newCustomer = new Customer(name, phone, dob, nid, father, mother, address, initialBalance);
        bank.addCustomer(newCustomer);
        FileManager.saveUser(newCustomer);
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        FileManager.exportTransaction(newCustomer.getAccount().getAccountNumber(), name + " opened account at " + time + " with balance: " + initialBalance);
        System.out.println("Account created! UserID: " + newCustomer.getUserID() + ", Account: " + newCustomer.getAccount().getAccountNumber());
    }

    public static Customer loginUser(Scanner sc) {
        System.out.print("\nEnter your Name or UserID to login: ");
        String input = sc.nextLine().trim();
        Customer customer = null;
        // Try to find by userID first
        for (Customer c : bank.getCustomers()) {
            if (c.getUserID().equalsIgnoreCase(input)) {
                customer = c;
                break;
            }
        }
        // If not found by userID, try by name
        if (customer == null) {
            for (Customer c : bank.getCustomers()) {
                if (c.getName().equalsIgnoreCase(input)) {
                    customer = c;
                    break;
                }
            }
        }
        if (customer == null) {
            System.out.println("No customer found with that name or userID.");
            return null;
        } else {
            System.out.println("\n--- User Information ---");
            System.out.println(customer.toDataString());
            return customer;
        }
    }

    public static void transactionMenu(Customer customer, Scanner sc) {
        int choice;
        do {
            customer.displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    customer.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    customer.withdraw(withdrawAmount);
                    break;
                case 3:
                    customer.viewBalance();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
        sc.nextLine(); // consume newline
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mainChoice;
        do {
            System.out.println("\n=== " + bank.getBankName() + " ===");
            System.out.println("1. Open New Account");
            System.out.println("2. Login to Existing Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (mainChoice) {
                case 1:
                    openNewAccount(sc);
                    break;
                case 2:
                    Customer loggedInCustomer = loginUser(sc);
                    if (loggedInCustomer != null) {
                        transactionMenu(loggedInCustomer, sc);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (mainChoice != 3);
        sc.close();
    }
}