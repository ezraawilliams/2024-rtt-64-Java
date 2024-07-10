package org.percholas.introtojava;
/*
String is a sequence of characters (any character, not just letters); String is immutable;

 */
public class StringDemo {
    public static void main(String[] args) {
        /*
        JVM has a string constant pool - checks to see if the string already exists
        in the constant pool and the reference is returned.
        If the string does not exist a new string instance is created in the pool
         */
        String s1 = "welcome";
        String s2= "welcome";
        String s = new String("Welcome");

        int stringLength = s.length();
        System.out.println("Length of string is: " + stringLength);

        System.out.println(s.isEmpty());//returns false
        System.out.println(s.isBlank());
        System.out.println(s.equals("welcome"));//should be false
        System.out.println(s.equalsIgnoreCase("welcome"));//true
        System.out.println(s.compareTo("Welcome"));//should return 0
        System.out.println(s.compareToIgnoreCase("welcome"));
        System.out.println(s.startsWith("w")); //false
        System.out.println(s.endsWith("e"));//true
        System.out.println(s.indexOf("W"));// 0
        System.out.println(s.lastIndexOf("e"));
        System.out.println(s.contains("x"));//false
        System.out.println(s.charAt(3));//c
        System.out.println(s.substring(3));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(" to Java"));
        String ourString = " Hey ";
        System.out.println(ourString.trim());
        ourString = ourString.replace(ourString, "Hey you!");
        System.out.println(ourString);
        String[] ourArray = ourString.split(" ");

        String str1 = "aabbaaac";
        String str2 = "Learn223Java55from555perscholas";
        // regex for sequence of digits
        String regex = "\\d+";

        // all occurrences of "aa" is replaceAll with "zz"
        System.out.println(str1.replaceAll("aa", "zz"));

        // replace a digit or sequence of digits with a whitespace
        System.out.println(str2.replaceAll(regex, " "));

        String intString = "1";
        int intValue = Integer.parseInt(intString); // parseInt method convert string into primitive data type

        Integer IntWrapper = Integer.valueOf(intString); // valueOf(): convert string into non primitive data type

        String doubleString = "1.0";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleValue);
        Float fwrapper = Float.valueOf(doubleString );
        System.out.println(fwrapper);

        Integer number = 10;
        System.out.println(number.toString());



    }
}
