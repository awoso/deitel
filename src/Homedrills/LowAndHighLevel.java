package Homedrills;

import java.util.Scanner;

public class LowAndHighLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();



        if(number < 30){
            System.out.println("Low level");
        }else {

        if (number < 50 ){
            System.out.println("Average level");
        }else {
            if(number < 80){
                System.out.println("High");
            }else {
            if(number <100) {
                System.out.println("A level");
            }else {
                System.out.println("out of range");
            }


            }
        }
        }
        }

    }
