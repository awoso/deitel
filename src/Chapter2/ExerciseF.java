package Chapter2;

import java.util.Scanner;

public class ExerciseF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of a circle: ");
        int radius = input.nextInt();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI *radius * radius;

        System.out.printf("diameter: is %f%n", diameter);
        System.out.printf("circumference of a circle: is %f%n" , circumference);
        System.out.println("area is: %f%n , area");
    }
}
