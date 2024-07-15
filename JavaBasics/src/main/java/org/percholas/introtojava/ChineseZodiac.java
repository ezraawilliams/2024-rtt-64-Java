package org.percholas.introtojava;
/*

Write a program that prompts the user to enter a year, and display the animal
for the year.
Note that year % 12 determines the Zodiac sign. 1900 is the year of the rat
because 1900 % 12 is 4. Listing 3.10 gives a program that prompts the user to
enter a year and displays the animal for the year

 */
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        switch(year % 12){
            case 0: System.out.println("Monkey"); break;
            case 1: System.out.println("Rooster"); break;
            case 2: System.out.println("Dog"); break;
            case 3: System.out.println("Pig"); break;
            case 4: System.out.println("rat"); break;
            case 5: System.out.println("Ox"); break;
            case 6: System.out.println("Tiger"); break;
            case 7: System.out.println("Rabbit"); break;
            case 8: System.out.println("Dragon"); break;
            case 9: System.out.println("Snake"); break;
            case 10: System.out.println("Horse"); break;
            case 11: System.out.println("Sheep"); break;
        }

        int marks = 80;
        if( marks > 70 )
            System.out.println("Distinction");
        if( marks > 35 )
            System.out.println("Pass");
        else
            System.out.println("Fail");
        System.out.println("Better luck next time");


    }
}
