package org.percholas.introtojava;

import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {
        //Primitive Data Types - embedded in the language:
        //Integral types: byte, short, int, long - whole number:
        byte num = 1; //Declared and assigned a the same time
        byte num2;
        num2 = 1;
        short num3;
        num3 = 20;
        int num4 = 150;
        long num5 = 9000000L;

        //Floating point values - if we need a decimal
        double num6 = 2.5;
        float num7 = 3.5f;

        //True/false value: boolean
        boolean winOrLose = false;

        //char - if we need a character
        char letterA = 'A';
        char anyLetterInTheAlphabet = 'a';
        char ezra, EZRA, eZra, ezRa;

        double radius;
        double area;


        //Assign a value to radius:
        radius = 20;

        //Compute the area:
        //area = radius * radius * 3.14159265359;
        area = Math.pow(radius,2 )*Math.PI;

        //Display results: using the plus sign for STRING CONCATENATION
        System.out.println("The area for the circle of radius " + radius + " is " + area);

        //Literal mean exact - this is what it is
        String myName = "Ezra";

        char myChar = 35;

        Scanner input = new Scanner(System.in);

        int i = 312;
        byte b = 58;
        long lval = 38885L;

        double length = 1.5;
        float pi = 3.1415927F;
        double avogadrosNumber = 6.022e23;
        double plancksConstant = 6.623E-34;

        char a = 0101, nine = 57, plus = 0x2b, tilde = 126;

        //Escape characters:
        //New line character creates a new line in the string
        //Carriage return moves the cursor to the beginning of the line w/out going to next line
        System.out.println("This will print on\r\n two lines.");
        System.out.println("She said \"Hello\" to me!");
        System.out.println("This will print two back-slashes: \\\\");






    }
}
