package Chapter3.Time;

import Chapter3.Time.Clock;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {

        Clock myClock = new Clock( 23, 59);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for Hour: ");
        int numberOne = scanner.nextInt();
        myClock.setHour(numberOne);

        System.out.println("Enter a number for minute: ");
        int numberTwo = scanner.nextInt();
        myClock.setMinute(numberTwo);

        System.out.println("Enter a number for seconds; ");
        int numberThree = scanner.nextInt();
        myClock.setSecond(numberThree);


        System.out.printf("hour is: %d%n" , myClock.getHour());
        System.out.printf("hour is: %d%n" , myClock.getMinute());
        System.out.printf("hour is: %d%n" , myClock.getSecond());


    }
}
