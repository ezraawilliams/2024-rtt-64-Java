package org.percholas.introtojava;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",");
        //Add values to StringJoiner:
        joinNames.add("Java");
        joinNames.add("Python");
        joinNames.add("C Sharp");
        joinNames.add("JavaScript");
        System.out.println(joinNames);

        //Passing comma, and square brackets as delimiters:
        StringJoiner joinData = new StringJoiner(",", "[","]");
        joinData.add("Java");
        joinData.add("Python");
        joinData.add("C Sharp");
        joinData.add("JavaScript");
        System.out.println(joinData);

        StringJoiner joinData2 = new StringJoiner(",", "[","]");
        joinData2.add("New York");
        joinData2.add("New Jersey");

        StringJoiner joinData3 = new StringJoiner(":", "(",")");
        joinData3.add("Dallas");
        joinData3.add("Chicago");

        StringJoiner mergeJoiners = joinData2.merge(joinData3);
        System.out.println(mergeJoiners);

    }
}
