package stringBuffer;
public class Ex2 {
	// Java Program to Demonstrate Conversion from
	// String to StringBuffer and StringBuilder

	// Main class

	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Creating objects of StringBuffer class
	        StringBuffer sbr = new StringBuffer("Geeks");
	        StringBuilder sbdr = new StringBuilder("Hello");

	        // Converting StringBuffer object to String
	        // using toString() method
	        String str = sbr.toString();

	        // Printing the above string
	        System.out.println(
	            "StringBuffer object to String : ");
	        System.out.println(str);

	        // Converting StringBuilder object to String
	        String str1 = sbdr.toString();

	        // Printing the above string
	        System.out.println(
	            "StringBuilder object to String : ");
	        System.out.println(str1);

	        // Changing StringBuffer object sbr
	        // but String object(str) doesn't change
	        sbr.append("ForGeeks");

	        // Printing the above two strings on console
	        System.out.println(sbr);
	        System.out.println(str);
	    }
	}



