package org.percholas.introtojava;
/*
1. Collection of values/variables of the same type - primitives or reference
2. The size of the array is fixed - not dynamic
3. An array in Java is an object - subclass of Object
 */

public class LearningArrays {
    public static void main(String[] args) {
        //Declare an array:
        String[] names;
        String names2[];
        double[] myList = new double[10];//declare the array to hold 10 values
        int month_days[];
        month_days = new int[12]; //long way of initializing array values:
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        //Access:
        System.out.println("April has "+month_days[3]+" days.");

        double[] myList2 = {1.9, 2.9, 3.4, 3.5};
        String[] myList3 = {"A", "B", "C", "D", "E", "F"};
        CharacterEx characterEx = new CharacterEx();
        CharacterEx characterEx2 = new CharacterEx();
        CharacterEx[] characterExs = {characterEx, characterEx2};
        myList2[2] = myList2[0] + myList2[1];
        System.out.println(myList2.length);
        // Here str is the array name of String type.
        String[] str = { "Java", "FOR", "EVERYONE" };
        System.out.println(str.length);

        int[] values = new int[5];

        for (int i = 1; i < values.length; i++) {
            values[i] = i + values[i-1];
        }
        values[0] = values[1] + values[4];

        for (int value: values){
            System.out.println(value);
        }
    }
}
