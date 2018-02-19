package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum = 0;
        int i;
        for(i = 0;i < n; i++){
            sum += i;
        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer sum = 1;
        int i;
        for(i = 1;i < n; i++){
            sum *= i;
        }

        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        long reversedDig = 0;
        long inputLong = val;
        while (inputLong != 0) {
            reversedDig = reversedDig * 10 + inputLong % 10;
            inputLong = inputLong / 10;
        }

        if (reversedDig > Integer.MAX_VALUE || reversedDig < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }

        return (int) reversedDig;


        //        int x = val;
//        for (int i = val; i <= val; i--) {
//        }
//
//        return x;
    }
}
