package WeekEndArrayAsssignment;


import java.util.List;

public class ReturnLargestElement{

//    public static int findLargestElement(List<Integer> numbers) {
//
//        if (numbers == null || numbers.isEmpty()) {
//
//        }
//
//        int largest = numbers.get(0);
//
//
//        for (int number : numbers) {
//            if (number > largest) {
//                largest = number;
//            }
//        }
//
//        return largest;
//    }

    public static int theLargest(int[]array , int largest)
    {
        int maximum = array[0];
        int element;
        for (int count = 1 ; count < array.length; count++) {
            element = array[count];

            if(maximum < element) {
                maximum = element;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {

        int[] numbers = {8,5,2,6,20,23,34};
        int largestElement = theLargest(numbers, 34);
        System.out.println("The largest element is: " + largestElement);
    }
}
