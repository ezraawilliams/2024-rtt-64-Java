package org.percholas.introtojava;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input a positive integer.
        Then print the multiplication table of that number.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        // check the input is valid or not using while()
        while(n<=0){
            System.out.println("That is not a valid number. Please try again");
            n = in.nextInt();
        }
        for(int i=1; i <= n; i++){
            System.out.println(n+" * "+i+" = "+ (n*i));

        }
//      /8  do {
//            int x = 1;
//
//            System.out.printf(n + " * " + x + " = " + (x*n));
//            x++;
//            //im trying to do the do while version of this
//            //this is more used for yes-no conditions
//        } while (n > 0);

    }
}
