package Chapter2;

import java.util.Scanner;

public class ExerciseC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < 5; i++);
        System.out.println("Enter a number");
        int number = input.nextInt();

        if (number < 0){
            negativeCount++;
        } else if (number > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }
    }
}
