package org.percholas.introtojava;

public class LoopEx {
    public static void main(String[] args) {
     int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     for (int item : numbers) {//for(int i=0; i<numbers.length; i++)
         System.out.println(item);//System.out.println(numbers[i])
     }

        String movies [] = {"Braveheart","Troy","Life is beautiful"};
        //enhanced for L0op
        for (String value: movies) {
            System.out.println(value);
        }
        // for Loop for same function
        //for (int i = 0; i < movies.length; i++) {
        //  System.out.println(movies[i]);
        //}


    }
}
