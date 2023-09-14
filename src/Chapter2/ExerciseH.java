package Chapter2;

import java.util.Scanner;

public class ExerciseH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        int factor = 0;
        for (int index = 1; index >= number; index++){
            if (number % index == 0) {
               factor++;
            }
        }
        System.out.println("number of factors of " + number +' '+"is"+' ' + factor );
    }
}
