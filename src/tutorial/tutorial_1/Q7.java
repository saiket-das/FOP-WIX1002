package tutorial.tutorial_1;

import java.util.Random;

// Print the number of odd and even number from 10 random numbers generated by computer. The random number must be from 10 – 100
public class Q7 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // Generate random number
            Random random = new Random();
            int number = random.nextInt(10, 100);

            // Check is number even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        }

    }
}
