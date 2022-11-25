package tim.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    /*

-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
-Assume that the user will only enter numbers, never letters
-For simplicity, create a Scanner as a static field to help with data input
-Create a new console project with the name ÅeMinElementChallengeÅf
     */

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] values = readIntegers(5);
        printArray(values);
        int minValue = findMin(values);
        System.out.println("Minimum element "+minValue);
    }

    private static int[] readIntegers(int num){
        int[] arr = new int[num];
        for(int i= 0; i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] arr){
        int max = Integer.MAX_VALUE;
        int min = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < max){
                min = arr[i];
            }
        }
        return min;
    }

    private static void printArray(int[] arr){
        Arrays.stream(arr).boxed().forEach(System.out::println);
    }
}
