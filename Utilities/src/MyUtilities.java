import java.text.SimpleDateFormat;
import java.util.*;

/*
  In this class, we have provided you with method stubs that need to be filled out.
  For each method, fill in the arguments it takes and the code it needs to produce
  the desired output.
 */
/* DON'T FORGET TO IMPORT THINGS YOU NEED HERE */
public class MyUtilities{
    /*
      Write a method that takes an array of chars as an argument. The method should then convert the char array into a String
      and return a string consisting of the built string, the string in uppercase, the string in lower case, and the length
      of the string, separated by the ':' character.
     */
    public String StringThings(char array[]){

        String charToString = array.toString();
        String upper = charToString.toUpperCase();
        String lower = charToString.toLowerCase();
        String length = Integer.toString(charToString.length());
        return charToString + ":" + upper + ":" + lower + ":" +length;

    }
    /*
      Write a method that takes a single String as an argument. It should split the string on the ',' character, and return
      the resulting String[] with trailing and leading whitespace trimmed from every element.
     */
    public String[] StringCleanAndSplit(String str){
        String splitter[] = str.split(",");
        for(int i=0; i<splitter.length ; i++){
            splitter[i] = splitter[i].trim();
        }
        return splitter;

    }
    /*
      Write a method that takes a String as an argument, and returns a reversed version of the string.
     */
    public String ReverseString(String str){
     String reversed = "";

        for (int i = 0; i <str.length()-1 ; i++) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
    /*
      Write a method that returns a String of today's date in the format: yyyy-mm-dd
     */
    public String WhatDayIsIt(){
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        String formattedDate = sdf.format(date);

        return formattedDate;

    }
    /*
      Write a method that takes six integers: year1, month1, day1, year2, month2, and day2
      The first three integers should be used to create one date object, and the second
      three should be used to create a second date object.
      Your program should then return, as a String, the period of time between these two dates in
      the format that looks like this:
          P[years]Y[months]M[days]d
      where the elements in square brackets are replaced with the number of years, months, and days
      between the two dates.
     */
    public String TimeBetween(/*PUT YOUR ARGUMENTS HERE*/){
        /* WRITE YOUR CODE HERE */
    }
    /*
      Write a method that prompts the user to enter Strings, storing them all, until the user enters the string "DONE".
      The program should then print out a String version of the list that the user entered that looks like this:
          [element 1, element 2,..., element n]
      where elements 1-n are the items entered by the user.
      Use the String "What is next on yourlist?" to prompt the user.
     */
    public String ListMaker(){
        /* WRITE YOUR CODE HERE */
    }
}