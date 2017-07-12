package strings_arrays;

import java.util.Random;

/**
 * Created by ryandesmond on 7/10/17.
 */

/* Write the code to find the smallest sum of any two numbers in an int[] of unknown length.

   Use the java.util.Random class to generate 100 random numbers between 1 and 22,222 and place them
   into the array. Iterate through this array two find the 2 numbers who's sum is smaller than any other.

    //----------------------------------------------------------------------
    import java.util.Random; // this line must come before class declaration
    //----------------------------------------------------------------------

    Random rand = new Random();
    int  n = rand.nextInt(50) + 1;
    //50 is the maximum and the 1 is our minimum

   Expected outpust:
   Original array: <contents of original array>
   Lowest sum: <a single int, the lowest sum of any two ints in the array>
*/


public class LocateSmallest {
    public static void main(String[] args) {
        int nums[] = new int[100];
        int min, min2;
        min= min2 = 22_222;

        Random rn = new Random();
        for (int i=0; i<100; i++) {
            nums[i] = rn.nextInt(22_222)+ 1;
        }

        System.out.println("Original array: ");
        for (int x: nums) {
            System.out.print(x+ " ");
        }
        System.out.println();


        for (int i=0; i<nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }

//        for (int x: nums) {
//            if (x < min) min = x;
//        }

        System.out.println("Min: "+ min);

//        for (int x: nums) {
//            if (x > min && x<min2) min2 = x;
//        }

        System.out.println("Min2: "+ min2);

        System.out.println("Sum of smallest two numbers: "+ (min+min2) );
    }
}
