package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void bubbleSort(Integer[] arr) {

        System.out.println("Before apply bubble sort:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After apply bubble sort:" + Arrays.toString(arr) + "\n");
        return;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Integer[] arr1 = new Integer[]{70, 61, 72, 83, 38};
        Integer[] arr2 = new Integer[]{7, 2, 76, 4, 99};
        Integer[] arr3 = new Integer[] {28, 9, 13, 78, 19};
        Integer[] arr4 = new Integer[] {68, 84, 41, 62, 18};
        Integer[] arr5 = new Integer[] {37, 57, 40, 13, 50};

        bubbleSort(arr1);
        bubbleSort(arr2);
        bubbleSort(arr3);
        bubbleSort(arr4);
        bubbleSort(arr5);
    }
}