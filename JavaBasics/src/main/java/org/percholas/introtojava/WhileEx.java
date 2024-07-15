package org.percholas.introtojava;

public class WhileEx {
    public static void main(String[] args) {
        /*int i = 0;
        while (i < 100) {
            System.out.println("Welcome to Java");
            // i++;
        }

        //    while(true) //for(;;;)
        //do..while
        int i=1;
        do{
            System.out.println(i);
            i++;
        } while(i<=10);

        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);*/

        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }

}
