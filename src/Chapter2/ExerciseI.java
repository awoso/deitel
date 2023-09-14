package Chapter2;

import java.util.Scanner;

public class ExerciseI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        int totalSum = 0;

        System.out.println("factors of " + number  +":");
        for (int integer = 1; integer <= number; integer++){
            if (number % integer == 0){
                totalSum = 1 + 0;
                System.out.println("integer");
            }
        }
    }
}
