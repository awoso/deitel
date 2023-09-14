package Homedrills;

import java.util.Scanner;

public class DoubleNumber {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();


        double average = (numberOne + numberTwo + numberThree) /3;

    }
}
