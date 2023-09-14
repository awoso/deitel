package Chapter3.school;

import java.util.Scanner;

public class SchoolTest {

    public static void main(String[] args) {

    School myschool = new School();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter school name");

        String SchoolName = scanner.nextLine();

        myschool.setSchoolName(SchoolName);

        System.out.println("Enter location");

        String location = scanner.nextLine();

        myschool. setLocation(location);

        System.out.println("Enter numberOfStudent");

        int numberOfStudent = scanner.nextInt();

        myschool. setNumberOfStudent(numberOfStudent);


        System.out.printf("school Name is: %s%n", myschool.getSchoolName());
        System.out.printf(" the school location is: %s%n", myschool.getLocation());
        System.out.printf(" the number of student is: %d%n", myschool.getNumberOfStudent());



    }
}
