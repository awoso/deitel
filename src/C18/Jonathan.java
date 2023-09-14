package C18;

import java.util.Scanner;

 public class Jonathan {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    int firstNumber = 1;
    int secondNumber = 2;
    int thirdNumber = 3;

       System.out.println("Enter the first number: ");
       firstNumber = scanner.nextInt();
      System.out.println("Enter the second number: ");
      secondNumber = scanner.nextInt();
       System.out.println("Enter the third number: ");
       thirdNumber = scanner.nextInt();

        int fourthNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = fourthNumber;

       System.out.printf("first number is: %s%n", firstNumber);
       System.out.printf("second number is: %s%n", secondNumber);
       System.out.printf("third number is: %s%n", thirdNumber);


    }
}