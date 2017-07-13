package strings_arrays;
/*
    Write the code to reverse the order of a standard array in place. Do not create a second array.
 */

public class ReverseArray {

    public static void main(String[] args) {
        int dummy;

        int[] arr = new int[100];
        System.out.println("Original array: ");
        for (int i = 0; i < 100; i++){
            arr[i] = i;
            System.out.print(arr[i]+ " ");
        }

        // now reverse the array in place - do not create a second array and copy values into it
        // change test

        for (int i=0; i<arr.length-1-i; i++) {
            dummy = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = dummy;
        }

        //print reversed array

        System.out.println("\n\nReversed array: ");
        for (int x: arr) {
            System.out.print(x+ " ");
        }
    }

}
