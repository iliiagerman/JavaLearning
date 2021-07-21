package com.illia.germanyuk;

public class ProizdUa {
    public static void main(String[] args) {
//        boolean sorted = true;
        int g = 0;
        int[] array = new int[]{5, 2, 8, 34, 565, 23, 5545, 343, 24, 5, 4, 5, 4, 34, 4, 6, 10};
        for (int f = 0; f <17; f++) {


            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    g = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = g;
gy7g7b9ft7b9ft7b9ft
                }


            }
            System.out.print(array[f] + " ");
        }
    }
}



