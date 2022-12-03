package com.bridgelabz_AlgorithmPractice;

public class PrimeNumber {

    public static void main(String[] args) {
        int[] array1 = new int[1000];
        int[] array2 = new int[1000];
        int count1 = 0;

        //putting the value in array1

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        //sorting prime number

        for (int j = 0; j < array1.length; j++) {
            int count = 0;

            for (int x = 2; x < array1[j]; x++) {
                if (array1[j] % x == 0) {
                    count++;
                }
            }
            if (count == 0) {
                array2[count1] = array1[j];
                count1++;
            }

        }

        // print the value
        System.out.println("The prime number in the array is ");
        for (int l = 0; l < array2.length; l++) {
            if (array2[l] != 0) {
                System.out.print(array2[l] + " ");
            }
        }
    }
}
