package com.zipcodewilmington.assessment1.part2;


import java.util.Scanner;
/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount))
                count++;
        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Object[] objectArray, Object objectToRemove) {
            return null;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int[] arrayLeast = new int[10];
        int count = 0;
        int minValue = 0;
        int minCount = objectArray.length;
        for (int i = 0; i < arrayLeast.length; i++) {

            for (int x = 0; x < arrayLeast.length; x++) {
                if (arrayLeast[x] == arrayLeast[i]) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                minValue = arrayLeast[i];
            }
        }
//...something is missing here...
        return minValue;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] resultArr = new Integer[objectArray.length + objectArrayToAdd.length];
        System.arraycopy(objectArray, 0, resultArr, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd, 0, resultArr, objectArray.length, objectArrayToAdd.length);
        return resultArr;
    }
}
