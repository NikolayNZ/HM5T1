package com.gmail.hm5t1;

public class Main {
    public static void main(String[] args) {
       /*1. Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
нечетных цифр в нем.*/

        int[] array = { 0, 5, 2, 4, 7, 1, 3, 19 };
        int q = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                q++;
            }
        }
        System.out.println("В данном масиве " + q + " нечетных чисел");
    }
}

