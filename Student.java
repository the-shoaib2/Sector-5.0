public class Student {
    String name, id;
    private double cgpa, waiverPercentage, paidAmount;
    final double fees = 50000;

    public Student(String name, String id, double cgpa, double paidAmat) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.paidAmount = paidAmat;
        setWaiverPercentage();
    }

    public void setWaiverPercentage() {
        if (cgpa == 4.0)
            waiverPercentage = 100;
        else if (cgpa >= 3.5)
            waiverPercentage = 50;
    }

    public void setWaiverPercentage(double waiverPercentage) {
        this.waiverPercentage = waiverPercentage;
    }

    public double getDueAmount() {
        double payableAmount = (1 - waiverPercentage / 100) * fees;
        return payableAmount - paidAmount;
    }

    public class TestStudentOutput {
        public static void main(String[] args) {
            Student st1 = new Student("Abir", "111111", 3.65, 15000);
            Student st2 = new Student("Liza", "222222", 3.25, 10000);

            st2.setWaiverPercentage(80);
            double dueAmount1 = st1.getDueAmount();
            double dueAmount2 = st2.getDueAmount();
            System.out.println("Dues of students:");
            System.out.printf(String.format("%s.%.1f\n", st1.name, dueAmount1));
            System.out.printf(String.format("%s.%.1f\n", st2.name, dueAmount2));

          // Output:
            // Dues of students:
            // Abir.25000.0
            // Liza.20000.0

        }
    }
}