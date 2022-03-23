import java.util.Arrays;
import java.util.Collections;

public class pract3c {
    public static void main(String[] args){

        // Initializing array of integers
        Integer[] num = { 30, 69, 45, 40, 15};

        // using Collections.min() to find minimum element
        int min = Collections.min(Arrays.asList(num));

        // using Collections.max() to find maximum element
        int max = Collections.max(Arrays.asList(num));

        // printing minimum and maximum numbers
        System.out.println("Minimum number of array is : " + min);
        System.out.println("Maximum number of array is : " + max);
    }   
}