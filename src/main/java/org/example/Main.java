package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void bubbleSort(Integer[] arr) {
        boolean swapped;

        System.out.println("Before apply bubble sort:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                if (!swapped) break;
            }
        }
        System.out.println("After apply bubble sort:" + Arrays.toString(arr) + "\n");
        return;
    }
    public static void main(String[] args) {
        Integer[][] arrays = {
                {70, 61, 72, 83, 38},
                {7, 2, 76, 4, 99},
                {28, 9, 13, 78, 19},
                {68, 84, 41, 62, 18},
                {37, 57, 40, 13, 50}
        };

        for (Integer[] arr : arrays) {
            bubbleSort(arr);
        }
    }
}