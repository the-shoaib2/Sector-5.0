import java.util.*;

public class Math3 {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(201);
            System.out.println("Random Number " + (i + 1) + ": " + randomNum);
        }

    }

}
