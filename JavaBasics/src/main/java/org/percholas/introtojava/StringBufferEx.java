package org.percholas.introtojava;

public class StringBufferEx {
    public static void main(String[] args) {
        //Create a new StringBuffer object:
        StringBuffer sb = new StringBuffer("Java Full Stack Developer");
        //length:
        int len = sb.length();
        System.out.println("Length: "+len);
        //capacity:
        int cap = sb.capacity();
        System.out.println("Capacity: "+cap);
        //append - add characters:
        sb.append(" and Software Engineering");
        System.out.println(sb);
        sb.append(". Java is my favorite language ");
        sb.append("but I love Python");
        System.out.println(sb);

        StringBuffer stringName = new StringBuffer("Welcome to Per Scholas");
        System.out.println("Original String: "+stringName);
        stringName.reverse();
        System.out.println("Reversed String: "+stringName);

        StringBuffer s = new StringBuffer("Java");
        s.insert(2, "language");
        System.out.println(s);

        //replace:
        StringBuffer sT = new StringBuffer("Java");
        sT.replace(0, 2, "Hello");
        System.out.println(sT);

        StringBuffer str = new StringBuffer("Welcome to Java Fullstack");
        System.out.println("Original String: "+str);
        System.out.println("Substring with starting index: "+str.substring(5));
        System.out.println("Substring with starting and ending index: "+str.substring(5, 12));
    }
}
