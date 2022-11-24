package tim.arrays;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysBasicsBuch {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        System.out.println("Average is "+getAverage(myIntegers));
    }

    private static int[] getIntegers(int number){
        System.out.println("Enter number "+number +" integer values .\r");
        int[] values = new int[number];
        for(int i = 0 ; i < number ; i++ ){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static double getAverage(int[] values){
        double result = 0.0;
        int sum = 0;
        for(int i = 0 ; i < values.length;i++){
            sum += values[i];
        }
        result = sum/values.length;
        return result;
    }
}
