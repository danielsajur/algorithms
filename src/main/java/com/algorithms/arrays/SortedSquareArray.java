package com.algorithms.arrays;

import java.util.Arrays;

public class SortedSquareArray {

    public static class Solution1{
        public int[] sortedSquaredArray(int[] array) {

            var sortedArray = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                var value = array[i];
                sortedArray[i] = value * value;
            }

            Arrays.sort(sortedArray);

            return sortedArray;
        }
    }

    public static class Solution2 {
        public int[] sortedSquaredArray(int[] array) {
            int start = 0, end = array.length - 1, index = end;
            var squareArray = new int[array.length];

            while (start <= end) {
                if (Math.abs(array[end]) >= Math.abs(array[start])) {
                    var value = array[end];
                    squareArray[index] = value * value;
                    --end;
                } else {
                    var value = array[start];
                    squareArray[index] = value * value;
                    ++start;
                }
                index--;
            }
            return squareArray;
        }
    }
}
