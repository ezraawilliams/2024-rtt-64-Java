package org.percholas.introtojava;

import java.util.Scanner;

enum Cars {
    BMW,
    JEEP,
    AUDI,
    VOLKSWAGON,
    NANO,
    FIAT;
}


public class SwitchEx {
    public static void main(String[] args) {
        // Declaring Enum variable
        Cars c;
        c = Cars.AUDI;
        // Switch keyword
        switch (c) {
            // Case statements
            case BMW:
                System.out.println("You choose BMW !");
                break;
            case JEEP:
                System.out.println("You choose JEEP !");
                break;
            case AUDI:
                System.out.println("You choose AUDI !");
                break;
            case VOLKSWAGON:
                System.out.println("You choose VOLKSWAGON !");
                break;
            case NANO:
                System.out.println("You choose NANO !");
                break;
            case FIAT:
                System.out.println("You choose FIAT !");
            default:
                System.out.println("NEW BRAND'S CAR.");
                break;
        }



        }

    private static int processArgument(String arg){
        int result;
        switch(arg){
            case "a":
                result = 1;
                break;
            case "b": //fall through
            case "c":
                result = 2;
                break;
            case "d":
            case "e":
            case "f":
                result = 3;
            case "g":
                result = 4;
                break;
            default:
                result = -1;
        }
        return result;
    }
}
