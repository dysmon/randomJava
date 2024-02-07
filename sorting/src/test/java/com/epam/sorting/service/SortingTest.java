package com.epam.sorting.service;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingTest {
    @Test
    public void testArrayAscOrder() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Act
        Sorting.quickSort(array);

        // Assert
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayDescOrder() {
        // Arrange
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Act
        Sorting.quickSort(array);

        // Assert
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayNonDistinctValues() {
        // Arrange
        int[] array = {3, 3, 3, 2, 2, 2, 2, 2, 6, 6};
        int[] expected = {2, 2, 2, 2, 2, 3, 3, 3, 6, 6};

        // Act
        Sorting.quickSort(array);

        // Assert
        assertArrayEquals(expected, array);
    }


    @Test
    public void testArrayRandom() {
        // Arrange
        int[] array = {7, 2, 99, 123, 14, 77, 33, 22, 11, 10};
        int[] expected = {2, 7, 10, 11, 14, 22, 33, 77, 99, 123};

        // Act
        Sorting.quickSort(array);

        // Assert
        assertArrayEquals(expected, array);
    }
}
