package org.percholas.introtojava;
/*
Our code can make decisions. How does our code do that? Flow control
statements.
if boolean-expression true do something; if false, do something else
 */

import java.util.Scanner;

public class FlowEx1 {
    public static void main(String[] args) {
        //one way if statement:
       /* Scanner in = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double grade = in.nextDouble();
        char letterGrade;
        if (grade >=90) {
            letterGrade='A';
        } else if (grade >=80) {
            letterGrade='B';
        } else if (grade >=70) {
            letterGrade='C';
        } else if (grade >=60) {
            letterGrade='D';
        } else {
            letterGrade='F';
        }
        System.out.println("Your grade is " + letterGrade);
*/
        int i=1, j=2, k=3;
        if (i>j)
        {
            if (i > k)
                System.out.println("A");
        }
        else
                System.out.println("B");

        boolean winOrLose = true;
        if (winOrLose){
            System.out.println("Yes");
        }
        int x =-5;

        if (x < 0)
        {
            System.out.println("x is negative");
        }
        else if (x == 0)
        {
            System.out.println("x is zero");
        }
        else
        {
            System.out.println("x is positive");
        }


    }
}
