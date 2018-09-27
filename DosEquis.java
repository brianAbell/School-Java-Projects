package edu.brcc.bab27843.ch14lab2;

import java.util.Scanner;

/**
 * @author Bunguiu Norales
 * @author Brian Bell
 * @author Professor Maxfield
 * check how many "XX" are in a string and return the count
 * 9/26/2018
 */
public class DosEquis {
    public static Scanner scnr = new Scanner(System.in);  // call a new scanner

   /**
    * count the number of XX that a string has
    * @param bucket is the userInput used for the count method
    * @return the count of XX in userInput
    */
    public static int count(String bucket) {

        String left; // String to count from the left
       if(bucket == null) {                              // checks for null
          return 0;
       }

       if (bucket.length() < 2){                         // base case. Rids of inputs that don't contain XX
            return 0;
        }

        left = bucket.substring(0,2);                   // set the variable for the 3 letters of the string


       if (left.equals("XX")) {                         // XX results in +1 increase
           return 1 + count(bucket.substring(2));
       }

       if ((left.equals("xX"))) {                       // xX results in no increase
           return  count(bucket.substring(2));
       }

       if(left.equals("xx")){                          // xx results in no increase
           return count(bucket.substring(1));
       }

       return count(bucket.substring(1));
    }

   /**
    * ask user for and input
    * @param args unused
    */
   public static void main(String[] args) {
        String userInput; //string for user input

        System.out.println("Enter word: ");
        userInput = scnr.nextLine();

        System.out.println(count(userInput));
    }
}