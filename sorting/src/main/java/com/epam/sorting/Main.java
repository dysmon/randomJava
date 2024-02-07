package com.epam.sorting;

import com.epam.sorting.service.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write 10 integers for Sorting line by line");

        for (int i = 0; i < 10; i++) {
            String in = input.readLine();
            try {
                array[i] = Integer.parseInt(in);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                i--;
            }
        }
        Sorting.quickSort(array);

        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
