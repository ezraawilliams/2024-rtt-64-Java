package org.percholas.introtojava;

public class CharacterEx {
    public static void main(String[] args) {
        Character letter = 'A';
        System.out.println(letter);
        Character asciNumber = 97;
        System.out.println(asciNumber);
        Character uninumber = '\u0031';
        Character uninumber2 = '\u0032';
        System.out.println(uninumber);
        System.out.println(uninumber2);
        System.out.println("======compareTo========");
        Character Obj1 = '2';
        Character Obj2 = '2';
        int result =    Obj1.compareTo(Obj2);
        System.out.println(result);
        System.out.println("----equals() -------");
        boolean  result2 =    Obj1.equals(Obj2);
        System.out.println(result2);
        System.out.println("----isletter() -------");
        // isletter method determines wheather the specified char value is letter
        System.out.println(Obj1.isLetter(Obj2));
        System.out.println("----isDigit() -------");
        // isDiggit() determin whether the specified char value is a digit
        System.out.println( Obj2.isDigit(Obj1));
        Obj1.valueOf('A');   // Obj1 = 'A'
        System.out.println("----compareTo-------");
        Character a = 'B';
        Character aa = 'B';
        System.out.println(a == aa);
        int rs =  a.compareTo(aa);
        System.out.println(rs);
        
    }


}
