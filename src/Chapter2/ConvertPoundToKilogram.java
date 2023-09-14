package Chapter2;

import java.util.Scanner;

public class ConvertPoundToKilogram {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in pounds: ");

        double pounds = input.nextDouble();

        double kilogram = pounds * 0.454;

        System.out.println(kilogram);


        }

    }

