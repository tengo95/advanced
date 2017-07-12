package strings_arrays;

import java.util.Random;

/**
 * Created by ryandesmond on 7/10/17.
 */

/* Write the code to find the smallest sum of any two numbers in a 2 dimensional array int[][] - both of unknown length.

    Use the java.util.Random class to generate 2 Random Numbers between 1 and 30. 1 number will be the 1st dimension
    of your array (the vertical array). The second number will be the 2nd dimension (the horizontal array).

   //----------------------------------------------------------------------
    import java.util.Random; // this line must come before class declaration
    //----------------------------------------------------------------------

    Random rand = new Random();
    int  n = rand.nextInt(50) + 1;
    //50 is the maximum and the 1 is our minimum

    As Before, use the java.util.Random class to generate 100 random numbers between 1 and 22,222 and place them
    into the array. Iterate through this array two find the 2 numbers who's sum is smaller than any other.

    Expected outpust:
    Original array: <contents of original array>
    Lowest sum: <a single int, the lowest sum of any two ints in the array>
*/

public class LocateSmallest2Dim {
    public static void main(String[] args) {

        int[][] array;
        int min=22_222, min2=22_222;

        Random rn = new Random();
        int dim1 = rn.nextInt(30)+ 1;
        int dim2 = rn.nextInt(30)+ 1;

        array = new int[dim1][dim2];

        System.out.println("Original array: ");
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {

                array[i][j] = rn.nextInt(22_222) + 1;
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {

                if (array[i][j] < min) {
                    min = array[i][j];
                } else if (array[i][j] < min2) {
                    min2 = array[i][j];
                }

            }
        }
        System.out.println("Min: "+ min);

        System.out.println("Min2: "+ min2);

        System.out.println("Sum of smallest two numbers: "+ (min+min2) );

    }
}
