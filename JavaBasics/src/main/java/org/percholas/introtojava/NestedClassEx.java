package org.percholas.introtojava;

public class NestedClassEx {
    String outerString = "I am out here!";
    static String staticOuterString = "I am out here in static!";

    class InnerClass {
        void method1(){
            System.out.println(outerString);
            System.out.println(staticOuterString);
        }
    }

    static class StaticNestedClass {
        void method1(){
            System.out.println(staticOuterString);
        }
    }

    public static void main(String[] args) {
        //Nested class you need to create an object using outer class
        System.out.println("Inner Class:");
        NestedClassEx nestedClass = new NestedClassEx();
        NestedClassEx.InnerClass innerClass = nestedClass.new InnerClass();
        innerClass.method1();

        //This is static so, you do not have to do all that:
        System.out.println("Static Nested Class:");
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.method1();
    }
}
