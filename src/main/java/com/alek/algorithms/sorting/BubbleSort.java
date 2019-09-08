package com.alek.algorithms.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int array[] = {1, 5, 2, -3, 13, 46, 22};


        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {


            for (int j = 0; j < lastIndex; j++) {

                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }


    public static void swap(int array[], int elem1, int elem2) {

        int temp = array[elem2];
        array[elem2] = array[elem1];
        array[elem1] = temp;
    }
}
