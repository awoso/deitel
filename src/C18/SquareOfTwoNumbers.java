package C18;

import java.util.Scanner;

public class SquareOfTwoNumbers {

    public static void main(String[] args){


        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        int square = number * number;

        System.out.println ("the square of number "  + number +  " is " + square);


    }
}
