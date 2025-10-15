package org.example.kyu4;

import java.util.Arrays;

//https://www.codewars.com/kata/55983863da40caa2c900004e
public class NextBiggerNumberWithTheSameDigits {
    public static void test(){
        System.out.println(nextBiggerNumber(12));
        System.out.println(nextBiggerNumber(513));
        System.out.println(nextBiggerNumber(2017));
        System.out.println(nextBiggerNumber(414));
        System.out.println(nextBiggerNumber(144));
        System.out.println(nextBiggerNumber(10990));
    }

    public static long nextBiggerNumber(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        int length = digits.length;

        int pivotIndex = -1;
        for (int i = length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                pivotIndex = i;
                break;
            }
        }

        if (pivotIndex == -1) {
            return -1;
        }

        int swapIndex = -1;
        for (int i = length - 1; i > pivotIndex; i--) {
            if (digits[i] > digits[pivotIndex]) {
                swapIndex = i;
                break;
            }
        }

        char temp = digits[pivotIndex];
        digits[pivotIndex] = digits[swapIndex];
        digits[swapIndex] = temp;

        Arrays.sort(digits, pivotIndex + 1, length);

        long result = 0;
        for (char c : digits) {
            int digit = c - '0';
            long newResult = result * 10 + digit;

            if (newResult < result) {
                return -1;
            }
            result = newResult;
        }

        return result;
    }
}
