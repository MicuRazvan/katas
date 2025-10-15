package org.example.kyu5;

//https://www.codewars.com/kata/55f4e56315a375c1ed000159
public class NumbersThatAreApowerOfTheirSumOfDigits {
    public static void test(){
        System.out.println(powerSumDigTerm(1));
        System.out.println(powerSumDigTerm(2));
        System.out.println(powerSumDigTerm(3));
        System.out.println(powerSumDigTerm(4));

    }

    public static long powerSumDigTerm(int n) {
        int foundNumbers = 0;
        long currentNumber = 80, lastFoundNumber = 0;

        while( n != foundNumbers){
            currentNumber++;
            long sumOfDigits = calculateSumOfDigits(currentNumber);
            long tempCurrentNumber = currentNumber;
            while(sumOfDigits < tempCurrentNumber && sumOfDigits != 1){
                sumOfDigits *= calculateSumOfDigits(tempCurrentNumber);
            }
            if(tempCurrentNumber == sumOfDigits){
                foundNumbers++;
                lastFoundNumber = currentNumber;
            }

        }

        return lastFoundNumber;
    }

    public static long calculateSumOfDigits(long n){
        long sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }

        return sum;
    }
}
