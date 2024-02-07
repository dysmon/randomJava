package com.epam.sorting.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortingParameterizedTest {

    private final int[] input;
    private final int[] expected;

    public SortingParameterizedTest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {new int[]{1, 2, 3, 2, 1}, new int[]{1, 1, 2, 2, 3}},
                        {new int[]{1, -1, 1, -1, 1}, new int[]{-1, -1, 1, 1, 1}},
                        {new int[]{1, 3, 1, 3, 1}, new int[]{1, 1, 1, 3, 3}},
                        {new int[]{99, 9, 11, 1, 0}, new int[]{0, 1, 9, 11, 99}}
                }

        );
    }

    @Test
    public void testMultiply() {
        Sorting.quickSort(input);
        assertArrayEquals(expected, input);
    }

}

