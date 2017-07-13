package strings_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    An array contains 10 numbers. There is exactly one number that is repeated in this array.
    Write a program to find the duplicate number. For example, if an array with length 4 contains numbers
    {0, 3, 2, 3}, then the duplicate number is 3. For this example just change the "3" to "-1". Print out the
    original array, then the duplicate number, then the array after the duplicate is removed.

    Hint: Arrays.sort()

 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        int duplicate;
        int temporary;


        //print original array

        int[] array = {1,2,7,4,5,6,3,7,8,9};
        System.out.println("Original array: ");
        for (int x: array) {
            System.out.print(x+ " ");
        }
        System.out.println();


        //BUBBLESORT
        for(int a=1; a < array.length; a++) {
            for(int b=array.length-1; b >= a; b--) {
                if(array[b-1] > array[b]) { // if out of order
                    // exchange elements
                    temporary = array[b-1];
                    array[b-1] = array[b];
                    array[b] = temporary;
                }
            }
        }

        //print sorted array

        System.out.println("Sorted array: ");
        for (int x: array) {
            System.out.print(x+ " ");
        }
        System.out.println();


        //Finding duplicate number

        for (int i=0; i<array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println("Duplicate number: "+ array[i]);
                    array[i] = array[j] = -1;
                }
            }
        }
        System.out.println();


        //Array after "removing" duplicate number

        System.out.println("Fixed array:");
        for (int x = 0; x<array.length; x++) {
            System.out.print(array[x]+ " ");
        }

    }
}
