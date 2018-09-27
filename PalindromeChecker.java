package edu.brcc.bab27843.ch14lab1;

import java.util.Scanner; //imports the scanner method

/**
 * This class uses recursion to check user input for Palindromes
 * @author Brian
 * @author Bunguiu
 * @author Professor Maxfield
 */
public class PalindromeChecker {
    public static Scanner scnr = new Scanner(System.in); //allows user input

    /**
     * Method used to determine if user input is Palindrome or not
     * @param s holds user input to be passed to this recursive method.
     * @return is/is not a Palindrome(true or false)
     */
    public static boolean isPalindrome(String s) {
        if(s != null) {                                     // as long as s is not null, if statements test

            //This is the base case
            if (s.length() <= 2 || s.isEmpty()) {                         // sets s to true if user input is single letter or blank
                return true;
            }

            char a = s.charAt(0);                               // holds the letter at first position
            char b = s.charAt(s.length()-1);                    // holds the letter at the last position

            if (!(Character.isLetter(a))) {                 // will set front character to a and move in if match
                a = s.charAt(1);
            }

            if (!(Character.isLetter(b))) {                 // will set end character to b and move in if match
                b = s.charAt(2);
            }

            a = Character.toLowerCase(a);                  // sets the current character a is holding as lowercase
            b = Character.toLowerCase(b);                  // sets the current character b is holding as lowercase

            if (a == b) {                                 // sets s to true if user input is complete Palindrome
                return true;
            }
        }
        return false;                                     // returns false if user input is not a Palindrome
    }

    /**
     * Main method
     * @param args unused
     */
    public static void main(String[] args) {
        String userInput;                                                                          //holds users input

        System.out.print("Enter a potential palindrome: ");                                        // print statement
        userInput = scnr.nextLine();                                                               // stores user input
        System.out.println("That's" + (isPalindrome(userInput) ? "" : " not") + " a palindrome."); // prints result
    }
}