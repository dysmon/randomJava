package com.epam.sorting.service;

/**
 * The Sorting class provides static methods for sorting arrays using the quicksort algorithm.
 */
public class Sorting {
    /**
     * Swaps two elements in the array.
     *
     * @param array       the array in which elements should be swapped
     * @param firstIndex  the index of the first element to be swapped
     * @param secondIndex the index of the second element to be swapped
     */
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    /**
     * Chooses a pivot element and partitions the array around it.
     *
     * @param array      the array to be partitioned
     * @param pivotIndex the index of the pivot element
     * @param endIndex   the index of the last element in the partition
     * @return the final position of the pivot element after partitioning
     */
    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);

        return swapIndex;
    }

    /**
     * Recursively sorts the subarray using the quicksort algorithm.
     *
     * @param array the array to be sorted
     * @param left  the starting index of the subarray
     * @param right the ending index of the subarray
     */
    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    /**
     * Sorts the given array using the quicksort algorithm.
     *
     * @param array the array to be sorted
     */
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
}
