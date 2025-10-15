package org.example.kyu5;

//https://www.codewars.com/kata/55aa075506463dac6600010d/train/java
public class IntegersRecreationOne {
    public static void test(){
        System.out.println(listSquared(1, 250));
        System.out.println(listSquared(42, 250));
        System.out.println(listSquared(250, 500));
    }
    public static long  calculateTheSumOfSquaredDivs(long n){
        long sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i * i;
                if (i != n / i) {
                    sum += (n / i) * (n / i);
                }
            }
        }

        return sum;
    }

    public static String listSquared(long m, long n) {
        String result = "";
        for(long i = m; i <= n; i++){
            long squaredSum = calculateTheSumOfSquaredDivs(i);
            if(Math.sqrt(squaredSum) == Math.floor(Math.sqrt(squaredSum))){
                result += "[" + i + ", " + squaredSum + "], ";
            }
        }

        if(!result.isEmpty()){
            result = result.substring(0, result.length() - 2);
        }
        return "[" + result + "]";
    }
}
