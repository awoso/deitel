package Chapter2;

import java.util.Scanner;

public class FutureDates{
    public static void main(String... args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Enter today's day of the week: ");
     int today = input.nextInt();

     System.out.println("Enter today's day of the future: ");
     int future = input.nextInt();

     int result = today + future %7;

     switch(today){
         case 0:
             System.out.print("sunday");
             break;

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

     }

     switch(future){

         case 0:
             System.out.println("future day is sunday");
             break;

         case 1:
             System.out.println("future day is monday");
             break;

         case 2:
             System.out.println("future day is tuesday");
             break;

         case 3:
             System.out.println("future day is wenesday");
             break;

         case 4:
             System.out.println("future day is thursday");
             break;

         case 5:
             System.out.println("future day is friday");
             break;

         case 6:
             System.out.println("future day is saturday");
             break;

         default:
             System.out.println(" on vacation ");









         }










    }






}
