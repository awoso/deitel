package Chapter2;

import java.util.Scanner;

public class  FourLoop{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print(" enter a number : ");

        int number = input.nextInt();

        int count = number;

        for( count= 0; count <= number; count++){
            System.out.println(count++);
        }


    }
}


