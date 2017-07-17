package strings_arrays;

public class StringReverse {

    /*
    This application must be called from the command line
    You must pass a single String into the class from the command line
    The main() must print out the contents of the String reverse order
     */
	public static void main(String[] args){

	    // initialize the string from the args array

		String[] strings = {"One", "Two", "Three"};

        // print out the letters in reverse order

		for (int i = strings.length-1; i>=0; i--) {

			char[] chars = strings[i].toCharArray();

			for (int j= chars.length-1; j>=0; j--) {

				System.out.println(chars[j] );
			}
		}

	}

}
