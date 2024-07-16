package org.percholas.introtojava;
/*
Multidimensional arrays in two or more dimensions.
Two-dimensional array - arranged in rows and columns
 */

public class MultiArray {
    public static void main(String[] args) {
        /*
        When we declare a two-dimensional array the first square bracket
        represents the rows and the second square bracket represents the
        columns.
        In this example we have each row containing 3 students, and
        each column representing two addresses per student.
         */
        String[][] studentAddresses = new String[3][2];
        studentAddresses[0][0] = "1 ABC Lane, Stone Mountain, GA, 30058";
        studentAddresses[0][1] = "33rd Tree Street, Stone Mountain, GA, 30088";
        studentAddresses[1][0] = "29th Maple Ln, Atlanta, GA, 30013";
        studentAddresses[1][1] = "";
        studentAddresses[2][0] = "1333 Right Ln, Ellenwood, GA, 30294";
        studentAddresses[2][1] = "";

        String[][] studentAddresses2 = {
                {"1 ABC Lane, Stone Mountain, GA, 30058", "33rd Tree Street, Stone Mountain, GA, 30088"},
                {"29th Maple Ln, Atlanta, GA, 30013",  ""},
                {"1333 Right Ln, Ellenwood, GA, 30294","" }
        };

        int[][] matrix2d = {
                {10,12,43,11,22},
                {20,45,56,1,33},
                {30,67,32,14,44},
                {40,12,87,14,55},
                {50,86,66,13,66},
                {60,53,44,12,11}
        };
        //length of columns:
        System.out.println(studentAddresses[0].length);
        //length of rows:
        System.out.println(studentAddresses.length);
        //iterating through array:
        for (int row = 0; row < studentAddresses.length; row++) {
            for (int col = 0; col < studentAddresses[row].length; col++) {
               System.out.println(studentAddresses[row][col]);
            }
        }

        int[] a = {17, -3, 42, 5, 9, 28};
        int[] c = new int[] {17, -3, 42, 5, 9, 28};
        int b[];
        int d[] = new int[10];



    }
}
