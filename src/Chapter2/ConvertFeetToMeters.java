package Chapter2;

import java.util.Scanner;

public class ConvertFeetToMeters {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value in feet:  ");
    double feet = input.nextDouble();

    double meter = feet * 0.305;

    System.out.println(meter);


    }
}
