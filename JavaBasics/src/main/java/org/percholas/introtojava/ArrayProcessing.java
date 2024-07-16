package org.percholas.introtojava;

import java.util.Arrays;

public class ArrayProcessing {
    public static void main(String[] args) {
        double[] dValues = new double[10];
        Arrays.fill(dValues, 6);	 // set all values to 50.0
        for(double i : dValues) {  // print using loop
            System.out.println(i);
        }
        long[] lValues = new long[500];
        Arrays.fill(lValues, 2057);	// set all values to 2057

        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        // Fill from index 1 to index 4.
        Arrays.fill(ar, 1, 5, 10);
        System.out.println(Arrays.toString(ar)); // print using toString()

        //sort method:
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        //copying:
        int[] sourceArrays = {2,3,4,5,10};
        int[] targetArrays = new int[sourceArrays.length];
        for(int i =0; i < sourceArrays.length; i++)
        {
            targetArrays[i] = sourceArrays[i];
        }
        targetArrays[4]=100;
        System.out.println(Arrays.toString(sourceArrays));
        System.out.println(Arrays.toString(targetArrays));
        if (targetArrays == sourceArrays) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }

        // clone method:
        // clone() method is inherited from Object class
        int[] sourceArray = {1,2,3};
        int[] targetArray = sourceArray.clone();
        sourceArray[2] = 500;

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(targetArray));

        //arraycopy method of System class:
        String[] names = {"Alex", "Brian", "Charles","David"};
        String[] copyOfNames = new String[names.length];

        //System.arraycopy(names, 0, copyOfNames, 0, names.length);
        copyOfNames = Arrays.copyOf(names, names.length);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(copyOfNames));

        int [] list1 = {1,2,3,4};
        int [] list2 = list1;
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));

        list2[3] = 400;
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));








    }
}
