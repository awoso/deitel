package Chapter2;

import java.util.Scanner;

public class ExerciseG {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int number = input.nextInt();

        if (number %3 ==0)
            System.out.println("Number is divisible by 3");

        if (number %3 !=0)
            System.out.println("Number is not divisible by 3");

        System.out.print( "Enter a number: ");

        int number1 = input.nextInt();

        if (number % 3 == 0){
            System.out.println("its divisible by 3");
        } else {
            System.out.println("Not divisible by 3");
        }



    }
}
