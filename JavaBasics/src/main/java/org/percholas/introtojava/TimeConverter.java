package org.percholas.introtojava;

public class TimeConverter {
    public static void main(String[] args) {
        /*Write a Java program to convert a total amount of seconds to the hour, minute
        and seconds
        Input seconds: 86399
        Output: 23:59:59
         */

        int seconds, minutes, hours;
        seconds = 86399;
        hours = seconds / 3600;
        System.out.println(hours);
        minutes = seconds % 3600 / 60;
        System.out.println(minutes);
        seconds = seconds % 60;// seconds %= 60
        System.out.println(seconds);
        System.out.println(hours+":"+minutes+":"+seconds);

    }
}
