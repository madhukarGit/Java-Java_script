package tim.arrays;

import java.util.Arrays;

public class ReferenceValueTypes {
    public static void main(String[] args) {
        int myValue = 10;
        int anotherValue = 10;
        System.out.println("myIntValue "+myValue);
        System.out.println("anotherValue "+anotherValue);
        anotherValue++;

        System.out.println("myIntValue "+myValue);
        System.out.println("anotherValue "+anotherValue);

        int[] myArray = new int[5];
        int[] anotherArray = myArray;
        System.out.println("myArray "+Arrays.toString(myArray));
        System.out.println("anotherArray "+Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myArray "+Arrays.toString(myArray));
        System.out.println("anotherArray "+Arrays.toString(anotherArray));

    }
}
