package tim.arrays;

import java.util.*;
import java.util.stream.Stream;

public class ArrayStringsScannerBuch {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] values = scanStrings(5);
        Comparator<String> sortStrings = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Arrays.sort(values,sortStrings);
        System.out.println("......sorted.......");
        Stream.of(values).forEach(System.out::println);
        int resultIndex = binarySearch(values,"John Lemon");
        System.out.println("Binary search for the target John Lemon is "+resultIndex);
        System.out.println("Result Index "+resultIndex);
    }

    private static String[] scanStrings(int number){
        System.out.println("Enter the String arrays length to insert "+number);
        String[] values = new String[5];
        for(int i=0;i<number;i++){
            values[i] = scanner.nextLine();
        }
        return values;
    }

    private static int binarySearch(String[] arr, String target){
        int start = 0 ;
        int end = arr.length;
        while(start < end){
            int mid = start+ (end-start)/2;
            int result = target.compareTo(arr[mid]);
            if(result == 0){
                return mid;
            }
            if(result > 0 ){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
