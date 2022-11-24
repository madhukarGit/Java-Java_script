package tim.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayChallenge {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.
    /*..........................................
           .................
            ......*/
    /*
    * Initialize the static scanner
    * */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = getIntegers(5);
        List<Integer> sortedValues = sortIntegers(values);
        System.out.println(sortedValues);
    }

    private static int[] getIntegers(int number){
        System.out.println("Enter the numbers with "+number+" in size");
        int[] values = new int[number];
        for(int i = 0 ; i < number ; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static List<Integer> sortIntegers(int[] arr){
        Comparator<Integer> sortIntegerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        List<Integer> values = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(values,sortIntegerComparator.reversed());
        return values;
    }
}
