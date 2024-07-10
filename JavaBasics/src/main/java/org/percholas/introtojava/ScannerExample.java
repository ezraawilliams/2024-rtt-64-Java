package org.percholas.introtojava;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The number is: " + number);
        System.out.println("Enter your name");
        String name1 = scanner.next();
        System.out.println("Your name: " + name1);
        scanner.close();

        // create an Object of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // read input(line of text) from the keyboard
        String name = input.nextLine();
        // prints the name
        System.out.println("My name is " + name);
        // closes the scanner
        input.close();

    }
}
