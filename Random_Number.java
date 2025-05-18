import java.util.*;

public class Random_Number {

    public static void main(String[] args) {

        
        Random random = new Random();
        int randomNumber = random.nextInt(1000) + 1; 

        System.out.println("Generated Random Number: " + randomNumber);

    }

}
