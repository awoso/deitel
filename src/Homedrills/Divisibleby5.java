package Homedrills;

import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("is number divisible by 5: ");
        int number = scanner.nextInt();


        if( number != 0 && number %5 ==0) {
            System.out.println("factor");
        } else {
            System.out.println("Not a factor");
        }
    }
}
