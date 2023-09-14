package C18;

import java.util.Scanner;

public class Jona {

    public static void keepRunning(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number 1 to 6: ");

        int number = input.nextInt();

        switch(number){
                case 1:
                    System.out.print("monday");
                    break;

                case 2:
                    System.out.print("tuesday");
                    break;
                case 3:
                    System.out.print("wenesday");
                    break;
                case 4:
                    System.out.print("thursday");
                    break;
                case 5:
                    System.out.print("friday");
                    break;
                case 6:
                    System.out.print("saturday");
                    break;
                case 0:
                    System.out.print("sunday");
                    break;

                 default:
                     keepRunning();


        }
    }
    public static void main(String[] args ){
        keepRunning();
    }
}