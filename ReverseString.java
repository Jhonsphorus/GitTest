//Date: 14/05/19
// Author: Johnson Adebayo
//Purpose: This is a program that output the reverse of String input

import java.io.StringBufferInputStream; // importing package/library io which contained class StringBuffer
import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating an variable input of the class Scanner

        System.out.print("Enter the String to reverse: "); // output the string to allow user enter type string
        String str1 = input.nextLine(); // storing the entered string in variable str1
        StringBuffer str5 = new StringBuffer(str1); // creating variable of data type StringBuffer

        // Output the reversed String
        System.out.println("The reverse of the String entered is: " + str5.reverse()); 

        //String str3 = str1.substring(2);   for obtaining substring it starts from the specified index
        // String str4 = str1.substring(0,3);  //for obtaining substring it starts and ends at the specified indexes 
        //str5.reverse();
        //System.out.println(str3);
        //System.out.println(str4);
        //str5.replace(0, 5, "PHORUSB1");
        // System.out.println(str5.replace(0, 5, "PHORUSB1"));

    }
}