package tim.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseChallenge {
    /*
    * -Write a method called reverse() with an int array as a parameter.

    -The method should not return any value. In other words, the method is allowed to modify the array parameter.

    -In main() test the reverse() method and print the array both reversed and non-reversed.

    -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

    -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

    Tip:
    -Create a new console project with the name ÅeReverseArrayChallengeÅf
    * */

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] values = getArray(5);
        reverseArray(values);
        printArray(values);
    }

    private static int[] getArray(int num){
        int[] arr = new int[num];
        for(int i = 0 ; i < num;i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static void reverseArray(int[] arr){
        for(int i = 0 ; i <= arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;
        }
    }

    private static void printArray(int[] values){
        System.out.println(Arrays.toString(values));
    }
}
