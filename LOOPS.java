
// FOR LOOPS
public class LOOPS {
    public static void main(String[] args) {
        // 1. Basic For Loop
        System.out.println("Using basic for loop:");
        for (int i = 0; i < 1; i++) {
            System.out.println("Hello, World!");
        }

        // 2. Enhanced For Loop (also known as For-Each Loop)
        System.out.println("\nUsing enhanced for loop:");
        String[] messages = {"Hello, World!"};
        for (String message : messages) {
            System.out.println(message);
        }

        // 3. For Loop with Multiple Variables
        System.out.println("\nUsing for loop with multiple variables:");
        for (int i = 0, j = 0; i < 1; i++, j++) {
            System.out.println("Hello, World! (i=" + i + ", j=" + j + ")");
        }

        // 4. Nested For Loop
        System.out.println("\nUsing nested for loop:");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Hello, World! (i=" + i + ", j=" + j + ")");
            }
        }

        // 5. For Loop with Break and Continue
        System.out.println("\nUsing for loop with break and continue:");
        for (int i = 0; i < 2; i++) {
            if (i == 1) {
                continue; // Skip this iteration
            }
            System.out.println("Hello, World! (i=" + i + ")");
            if (i == 1) {
                break; // Exit loop
            }
        }
    }
}




// While LOOPS
// public class LOOPS {
//     public static void main(String[] args) {
//         // 1. Basic while loop
//         System.out.println("Using basic while loop:");
//         int count1 = 0;
//         while (count1 < 1) {
//             System.out.println("Hello, World!");
//             count1++;
//         }

//         // 2. While loop with condition false initially
//         System.out.println("\nUsing while loop with condition false initially:");
//         int count2 = 1;
//         while (count2 < 1) {
//             System.out.println("Hello, World!"); // This will not be printed
//             count2++;
//         }

//         // 3. Infinite while loop (will only stop when interrupted)
//         // Uncomment the following code to test; it will run indefinitely
//         /*
//         System.out.println("\nUsing infinite while loop:");
//         int count3 = 0;
//         while (true) {
//             System.out.println("Hello, World!");
//             count3++;
//             if (count3 >= 1) break; // Breaks the loop after printing once
//         }
//         */

//         // 4. Nested while loop
//         System.out.println("\nUsing nested while loop:");
//         int outerCount = 0;
//         while (outerCount < 1) {
//             int innerCount = 0;
//             while (innerCount < 1) {
//                 System.out.println("Hello, World!");
//                 innerCount++;
//             }
//             outerCount++;
//         }
//     }
// }



// DO WHILE LOOPS 

// public class LOOPS {
//     public static void main(String[] args) {
//         // 1. Basic do-while loop
//         System.out.println("Basic do-while loop:");
//         int count1 = 0;
//         do {
//             System.out.println("Hello, World!");
//             count1++;
//         } while (count1 < 1); // Loop condition: execute once

//         // 2. do-while loop with multiple iterations
//         System.out.println("\ndo-while loop with multiple iterations:");
//         int count2 = 0;
//         do {
//             System.out.println("Hello, World!");
//             count2++;
//         } while (count2 < 5); // Loop condition: execute 5 times

//         // 3. do-while loop with a flag
//         System.out.println("\ndo-while loop with a flag:");
//         boolean continueLoop = true;
//         int loopCount = 0;
//         do {
//             System.out.println("Loop iteration: " + loopCount);
//             loopCount++;
//             // Set continueLoop to false after 3 iterations
//             if (loopCount >= 3) {
//                 continueLoop = false;
//             }
//         } while (continueLoop); // Loop condition based on flag
//     }
// }
