package strings_arrays;

public class StringReverse {

    /*
    This application must be called from the command line
    You must pass a single String into the class from the command line
    The main() must print out the contents of the String reverse order
     */
	public static void main(String[] args){

	    // initialize the string from the args array

		char dummy;

        // print out the letters in reverse order

		for (int i=0; i<args.length; i++) {
			for (int j=0; j<args[i].length(); j++ ) {
				args[i].charAt(j) = dummy;

			}
		}

		for (int i=0; i<args.length-1-i; i++) {
			for (int j=0; j<args[i].length(); j++ ) {
				dummy = args[i].charAt(j);
			}

		}

	}

}
