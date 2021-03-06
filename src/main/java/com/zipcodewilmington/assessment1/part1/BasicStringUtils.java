package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String camString = str.substring(0,1).toUpperCase() + str.substring(1);
        return camString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        return new StringBuilder(str).reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        //create string builder
        StringBuilder camCase = new StringBuilder();
        //append a string into StringBuilder
        camCase.append(str);
        // reverse
        camCase = camCase.reverse();
        String result = camCase.substring(0, 1).toUpperCase() + camCase.substring(1);
        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {


        return null;
    }
}
