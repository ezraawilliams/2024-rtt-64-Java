package org.percholas.introtojava;

public class MathEx {
    public static void main(String[] args) {
      /*  int a = 10, b = -20;
        System.out.println(Math.abs(a)); // 10
        System.out.println(Math.abs(b)); // 20
        System.out.println(Math.max(a, b)); // 10
        System.out.println(Math.min(a, b)); // -20

        double x = 28;
        double y = 4;

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));
        //returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        // return the logarithm of given value
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));
        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));

        // return the log of x + 1
        System.out.println("log1p of x is: " +Math.log1p(x));

        // return a power of 2
        System.out.println("exp of x is: " +Math.exp(x));

        double d = 83.67;
        System.out.println(Math.ceil(d));  // return double & rounded up to its nearest integer
        System.out.println(Math.floor(d)); // return double and rounded down to its nearest integer
        System.out.println(Math.rint(d)); // return double but find the closest integers for these double numbers
        //Math.round() It is used to round of the decimal numbers to the nearest value.
        System.out.println(Math.round(d));  // 84;
        double a = 1.878;
        System.out.println(Math.round(a));  // 2
        // value equals to 5 after decimal
        double b = 1.5;
        System.out.println(Math.round(b));  // 2
        // value less than 5 after decimal
        double c = 1.34;
        System.out.println(Math.round(c));  // 1

        // generate integer number b/w 1 to 100
        int n1 = (int) (Math.random()*100);
        int n2 = (int) (Math.random()*100);

        // display generated integer numbers
        System.out.println(n1);
        System.out.println(n2);*/
        // declare max and min
        int min = 100;
        int max = 1000;

        // calculate range
        int range = (max-min) + 1;

        // generate floating-point number b/w 100 to 1000
        double d1 = Math.random()*range + min;

        // generate integer number b/w 100 to 1000
        int n1 = (int)(Math.random()*range + min);

        // display result
        System.out.println(d1);
        System.out.println(n1);






    }
}
