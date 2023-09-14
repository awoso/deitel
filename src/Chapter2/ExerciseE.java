package Chapter2;

import java.util.Scanner;

public class ExerciseE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter 2nd integer");
        int number2 = input.nextInt();

        int square1 = number1 * number2;
        int square2 = number1 * number2;
        int square3 = square1 * square2;

        int sum = square1 + square2;
        int diff = square1 - square2;

        System.out.printf("the square1 is: %d%n", +square1);
        System.out.printf("the square3 is: %d%n", +square3);
        System.out.printf("the sum is: %d%n", +sum);
        System.out.printf("the sum is: %d%n", +diff);

    }
}
