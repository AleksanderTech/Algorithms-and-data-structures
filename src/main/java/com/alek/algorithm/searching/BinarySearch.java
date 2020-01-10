package com.alek.algorithm.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(searchBinary(101, numbers));
    }

    private static int searchBinary(int searchingElement, int[] numbers) {
        // 0 - 9
        int start = 0;
        int end = numbers.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == searchingElement) {
                return searchingElement;
            } else if (numbers[mid] < searchingElement) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
