package org.example.kyu6;

import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/56121f3312baa28c8500005b
public class ILoveBigNumsAndICannotLie {
    public static String Biggest(int[] nums) {
        String result = "";
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(String.valueOf(nums[i]));
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                String a = numbers.get(i) + numbers.get(j);
                String b = numbers.get(j) + numbers.get(i);

                if (Integer.parseInt(a) < Integer.parseInt(b)) {
                    String temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }


        if(result.charAt(0) == '0'){
            return "0";
        }
        return result;
    }
}
