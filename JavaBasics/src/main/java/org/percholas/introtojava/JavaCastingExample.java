package org.percholas.introtojava;

public class JavaCastingExample {
    public static void main(String[] args) {
        //Explicit type casting - we assign a value of a LARGER data type with a smaller TYPE
        int x;
        double y = 9.99;
        x = (int) y; //It will compile in Java and the result will be 9
        System.out.println(x);

        byte i = 40;
        // No casting needed for below conversion
        short j = i;
        int k = j;
        long l = k;
        float m = l;
        double n = m;
        System.out.println("byte value : "+i);
        System.out.println("short value : "+j);
        System.out.println("int value : "+k);
        System.out.println("long value : "+l);
        System.out.println("float value : "+m);
        System.out.println("double value : "+n);
        float f = 1.5e3f;
        k = (int)f; // Explicit - ok
      //  k = f ;// Not Allowed - narrowing

        float f3 = 100;
      //  int myInt = f3;
        System.out.println("float value : "+f3);

        //Implicit type casting - automatic type conversion:
        int radius = 20;
        long l2 = radius;
        float f2 = l2;

        //Constant remains constant and we use the final keyword
        final String HER_NAME = "Surbhi";
        //HER_NAME="Asiya";
    }
}
