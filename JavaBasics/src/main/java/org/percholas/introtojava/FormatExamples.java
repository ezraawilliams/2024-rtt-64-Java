package org.percholas.introtojava;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.time.Month;

public class FormatExamples {
    public static void main(String[] args) {
        //format method from the System class:
        /*int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format(" This is an integer: %d and this is a byte: %d.\r\n", i, b);
        System.out.format(" This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny);
        System.out.format(" And this is a String: %s", "This is a string.\r\n");

        long n = 461012;
        System.out.format("%d %n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f %n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"
        System.out.format("%tD%n", c);    // -->  "05/29/06"
        //Print f examples:
        System.out.printf("Hello, %s!", "Michael Scott");
        System.out.printf("Hello, %s!", "Jim");
        System.out.printf("Hello, %s!", "Dwight");

        System.out.printf("Hello, %s!%n", "Michael Scott");
        System.out.printf("Hello, %s!%n", "Jim");
        System.out.printf("Hello, %s!%n", "Dwight");

        System.out.println("------------------------");
        String data = "Hello World!";
        System.out.printf("Printing a string: %s\n", data);
        System.out.printf("Printing a string in uppercase: %S\n", data);
        int x = 100;
        System.out.printf("Printing a decimal integer: %d\n", x);
        int hours = 100;
        double days = 100/24.0; // used 24.0 to avoid integer division
        System.out.print("days: ");
        System.out.printf("%.3f%n",days);
        // -------- Specifying Width --------
        System.out.printf("%-10.2f%n", 18.0); // left aligned: -
        System.out.printf("%10.2f%n", 20.0); // right aligned
        System.out.printf("%10.3f", 10.2); // no text
        System.out.printf("%n"); // only %n
        System.out.printf("%10.2f%5d%n", 15.7,3); // no text and %n
        System.out.printf("%10.2f%d%n", 15.7,3); // no space before 3
        System.out.printf("%10.2f", 15.7);
        System.out.printf("%n%10.2f%n%5d%n", 11.3,8);
        // --- mix different data types --------------
        System.out.printf("%s is %d years old","Jane", 23);
        System.out.println();

        LocalDate dob = LocalDate.of(1971, Month.MAY, 16);
        System.out.printf(  "%1$tB %1$td,  %1$tY is %2$s's birth day. Let's go and celebrate.",
                dob, "Mike");*/

        //String.format:
        // The objects to be used during formatting
        String s = "Per Scholas";
        float n = 74.47f;
        // The result formatted String objects
        String str1 = String.format("My Company name is %s", s), str2 = String.format("My age is %.8f",
                n);
        // Printing the resultant formatted Strings
        System.out.println(str1 + " " + str2);

        double number = 123456789.123;
        String pattern = "####,####.##";

        DecimalFormat numberFormat = new DecimalFormat(pattern);

        System.out.println(number);

        System.out.println(numberFormat.format(number));





    }
}
