package Chapter2;

public class ExerciseB {
    public static void main(String[] args) {
        System.out.println("Number | square | cube");
        for (int i = 0; i <10; i++){
        int square = i * i;
        int cube = i * i * i;
            System.out.println("%6d | %6d | %4d%n, 'i, square, cube");
        }
    }
}
