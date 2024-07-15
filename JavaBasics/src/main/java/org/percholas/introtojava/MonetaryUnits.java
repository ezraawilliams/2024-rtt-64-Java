package org.percholas.introtojava;
import java.util.Scanner;
public class MonetaryUnits {

    public static void main(String[] args) {
        /*
        Write a program that lets the user enter decimal dollars and cents,
        and outputs the monetary equivalent in single dollars, quarters, dimes,
        nickels, and pennies.
    For example:
    Input:  3.87
    Output:	3 dollars
		    3 quarters
		    1 dime
		    0 nickels
		    2 pennies
         */
     System.out.println("Please enter some money: ");
     Scanner input = new Scanner(System.in);
     double money = input.nextDouble();




     final int DOLLAR = 1;
     final double QUARTER = 0.25;
     final double DIME = 0.10;
     final double NICKEL = 0.05;
     final double PENNY = 0.01;

     int dollarAmount = (int) (money / DOLLAR);  // is this correct?
     System.out.println(dollarAmount);

     double change = money - dollarAmount;
     int quarterAmount = (int) (change / QUARTER);
     System.out.println(quarterAmount);

     // change = change % QUARTER
     change -= (quarterAmount * QUARTER);

     int dimeAmount = (int) (change / DIME);
     System.out.println(dimeAmount);

     change -= (dimeAmount * DIME);
     int nickelAmount = (int) (change/NICKEL);
     System.out.println(nickelAmount);

     change -= (nickelAmount * NICKEL);
     int pennyAmount = (int) (change/PENNY);
     System.out.println(pennyAmount);



     

    }
}
