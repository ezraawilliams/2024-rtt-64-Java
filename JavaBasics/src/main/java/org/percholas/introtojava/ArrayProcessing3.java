package org.percholas.introtojava;

import java.util.Arrays;

public class ArrayProcessing3 {
    public static void main(String[] args) {
        //Binary search:
        int intArr[] = {10, 20, 15, 22, 35};

        // sorting the array
     Arrays.sort(intArr);

        // declare element for searching
        int element = 20;
        System.out.println(element + " found at index = " + Arrays.binarySearch(intArr, element));

    }
}
