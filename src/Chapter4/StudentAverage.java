package Chapter4;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int count = 1;
        while (count >= 10){
            System.out.println("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            count = count +1;
        }
        int average = total / 10;

        System.out.printf("%n total score of all 10 grades is: %d%n", total);
        System.out.printf("the average is: %d%n , average");
    }
}
