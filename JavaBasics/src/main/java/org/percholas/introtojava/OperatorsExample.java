package org.percholas.introtojava;

public class OperatorsExample {
    public static void main(String[] args) {
     /*   int a=3, b=4;
        boolean r;

        //Relational Operators:
        r = (a == b); //false
        System.out.println(r);
        r= (a != b);
        System.out.println(r);
        r = (a < b);
        System.out.println(r);
        r = (a > b);
        System.out.println(r);
        r = (a <= b);
        System.out.println(r);
        r = (a >= b);
        System.out.println(r);
        System.out.println(a < b && b<a && a==b); //false
        System.out.println(a>b && a<b);//short circuit evaluation
        System.out.println(a<b || b<a || a==b);//true - short circuit evaluation
        int x=0;
        x += 5; //x = x+5
        x -= 5; //x = x-5
        x *= 5; //x = x*5
        x /= 5; // x = x/5
        x %=5; //x = x%5*/

        int a=20, b=10, c=0, d=20, e=40, f=30;
        c = b++; //Remember that these are two operations, not one - c=b, b++
        System.out.println("Value of c (b++) = " + c);
        //Value of c (b++) = 10
        System.out.println("Value of b (b++) = " + b);
        c = ++a;
        System.out.println("Value of c (++a) = " + c);
        System.out.println("Value of a (++a) = " + a);
        //Value of c (++a) = 21

        c = e--; //two operations - c=e, e--
        System.out.println("Value of c (e--) = " + c);
        //Value of c (e--) = 40
        System.out.println("Value of e (e--) = " + e);
        c = --d;
        System.out.println("Value of c (--d) = " + c);
        //Value of c (--d) = 19
        System.out.println("Value of d (--d) = " + d);

/*        int age = 180;
        String result = age < 100 ?
                "Less than 100" : "Greater than 100";
        System.out.println(result); //Less than 100

        System.out.println(5%2);*/







    }
}
