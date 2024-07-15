package org.percholas.introtojava;

import java.util.Scanner;

/*
This program first prompts the user to enter a year as an int, and checks if it is a
leap year.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by
400.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a year as a whole number");
        int year = in.nextInt();

        if(((year % 4 == 0) && (year % 100 !=0))  || (year % 400 == 0)){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }



    }
}
