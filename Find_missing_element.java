package orrg.study.org.week2;
import java.util.Arrays;

public class Find_missing_element {

    public static void main(String[] args) {

        int arr[] = {1,4,3,2,8,6,7};

        // Sort the array
        Arrays.sort(arr);

        // Loop through the array
        for(int i = 0; i < arr.length; i++) {

            // Check missing number
            if(arr[i] != i + 1) {

                System.out.println("Missing number is: " + (i + 1));
                break;

            }
        }
    }
}
