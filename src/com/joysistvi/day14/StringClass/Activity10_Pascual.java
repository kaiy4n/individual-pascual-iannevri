package com.joysistvi.day14.StringClass;

import java.util.Locale;
import java.util.Scanner;

public class Activity10_Pascual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        // RESEARCH PHASE

        // [1] contains()
        // - a method that checks whether a string contains a sequence of characters
        // - returns 'true' if the characters exist and 'false' if not
        // - Syntax: contains(CharSequence s)

        System.out.println("[1] contains()");
        String emailAddress = "iannevribp@gmail.com";

        System.out.println("Original Text: " + emailAddress);
        System.out.println("Contains '@gmail.com'?: " + emailAddress.contains("@gmail.com"));      // Displays true
        System.out.println("Contains '@maynilad.com'?: " + emailAddress.contains("@maynilad.ph"));    // Displays false
        System.out.println();



        // [2] endsWith()
        // - a method that checks whether a string ends with the specified character(s)
        // - returns 'true' if the string ends with the specified character and 'false' if not
        // - Syntax: endsWith(String suffix)

        System.out.println("[2] endsWith()");
        String icelandicName = "Ian Nevri Irvenson";

        System.out.println("Original Text: " + icelandicName);
        System.out.println("Ends with 'son'?: " + icelandicName.endsWith("son"));          // Displays true
        System.out.println("Ends with 'dottir'?: " + icelandicName.endsWith("dottir"));       // Displays false
        System.out.println();

         */







        // [3] startsWith()
        // - a method that checks whether a string starts with the specified character(s)
        // - returns 'true' if the string starts with the specified character and 'false' if not
        // - Syntax: startsWith(String prefix)
        // Reference: https://www.w3schools.com/java/ref_string_startswith.asp

        System.out.println("[3] startsWith()");
        String countryName = "South Korea";

        System.out.println("Original Text: " + countryName);
        System.out.println("Starts with 'South'?: " + countryName.startsWith("South"));        // Displays true
        System.out.println("Starts with 'North'?: " + countryName.startsWith("North"));        // Displays false
        System.out.println();















        /*
        // [4] indexOf()
        // - a method that returns the position of the first occurrence of specified character(s) in a string
        // - returns an int value, representing the index or -1 if it never occurs
        // - Syntax: indexOf(String str)

        System.out.println("[4] indexOf()");
        String movieQuote = "If we burn, you burn with us!";

        System.out.println("Original Text: " + movieQuote);
        System.out.println("Word to look for: 'burn'");
        System.out.println("Word first found at index: " + movieQuote.indexOf("burn"));
        System.out.println();



        // [5] trim()
        // - a method that removes whitespace from both ends of a string
        // - returns a String, which is a copy of the string without leading and trailing whitespace

        System.out.println("[5] trim()");
        String originalText = "          I don't know why I put lots of whitespace.       ";

        System.out.println("Original text:" + originalText);
        System.out.println("Using trim():" + originalText.trim());
        System.out.println();



        // [6] replace()
        // - a method that searches a string for a specified character, and returns a new string
        //   where the specified character(s) are replaced
        // Syntax: replace (char oldChar, char newChar)

        System.out.println("[6] replace()");
        String myStatement = "I love Jollibee. Jollibee #1.";

        System.out.println("Original Text: " + myStatement);
        System.out.println("Using replace(): " + myStatement.replace("Jollibee", "McDonald's"));
        System.out.println();



        // [7] toCharArray()
        // - a method that returns a new char array representing the contents of the string

        System.out.println("[7] toCharArray()");
        String artistName = "Taylor Swift";

        System.out.println("Original Text: " + artistName);
        char[] artistNameArray = artistName.toCharArray();
        System.out.println("Display character array: ");
        for(int i = 0; i < artistNameArray.length; i++) {
            System.out.println("Index " + i + ": " + artistNameArray[i]);
        }
        System.out.println();

        // STRETCH GOAL
        System.out.println("Stretch Goal:");
        System.out.print("Enter a Country Name: ");
        String countryInput = scanner.nextLine();
        System.out.println();

        System.out.println("Country Name: " + countryInput);
        System.out.println("First character: " + countryInput.charAt(0));
        System.out.println("Last character: " + countryInput.charAt(countryInput.length() - 1));

        int count = 0;
        int vowelCount = 0, consonantCount = 0;
        String lowerCasedInput = countryInput.toLowerCase();
        for (int j = 0; j < lowerCasedInput.length(); j++) {
            char ch = lowerCasedInput.charAt(j);

            if (ch == 'p') {
                count++;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }


        }

        System.out.println("Occurrences of 'P/p': " + count + " times");
        System.out.println("No. of Vowels: " + vowelCount);
        System.out.println("No. of consonants: " + consonantCount);

         */

        scanner.close();
    }

}
