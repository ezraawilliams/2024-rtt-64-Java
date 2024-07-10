package org.percholas.introtojava;
/*
Every primitive type has a class associated with it. Primitives are not objects and as
such they are limited in their ability and to bridge any gaps, we have the Wrapper classes
boolean - Boolean; char - Character; byte - Byte, int - Integer
 */

public class WrapperClassesEx {
    byte b = 100;
    Byte bb = 100;
    short s = 100;
    Short ss = 100;
    int i = 100;  // primitive data type
    Integer ii = 100;  // literal method
    int myInt = 1000;
    Integer iii = Integer.valueOf(myInt);  // new operator
    long l = 100l;
    Long ll = 100l;
    float f = 100.0f;
    Float ff = 21.24f;
    double d = 546.32;
    Double dd = 545.255;
    char ch = 'a';
    Character cha = 'a';
    boolean bo = true;
    Boolean boo = true;

    //AutoBoxing - it mean we are taking a primitive and upgrading it to an object:
    int a = 20;
    Integer convertintoInteger = a;

    char c = 'A';
    Character convertintoChar = c;

    double d2 = 565.23;
    Double convertintoDouble = d2;

    //Unboxing - We are demoting an object to a primitive level:
    Integer i2 = 56;
    int ii2 = i2;

    Character c2 = 'a';
    char ch2 = c2;

    Double d3 = 2563.32;
    double dd2 = d3;
}
