package OOP_Assigement;
/*
Write a Java program that checks whether a given string is a palindrome or not. Ex: MADAM is a palindrome?
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :" );
        String str =sc.nextLine();      // read String
        //String str ="madam";
        String rev="";

        for (int i = str.length()-1;i>=0;i--)
        {
         rev = rev +str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println(rev+" "+"is palindrome");
        }
        else
        {
            System.out.println(rev+" "+"is not a palindrome");
        }
    }
}
