package org.percholas.introtojava;

import java.util.Scanner;

/*
Body Mass Index (BMI) is a measure of health on weight.
It is calculated by taking an individual’s weight in kilograms and dividing by the square of
their height in meters.
BMI = (Weight in Kg) / (Height in Meters * Height in Meters)
For example,
weight = 75 kg, height = 1.5 m
BMI = 75 / (1.5*1.5) = 33.33
The interpretation of BMI for people 16 years or older is as f

 */
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight,height, bodyMassIndex;
        System.out.print("Enter your weight (in kilograms): ");
        weight = in.nextDouble();
        //trueeee
        System.out.print("Enter your height (in meters): ");
        height = in.nextDouble();

        bodyMassIndex = weight/(height * height);

        if(bodyMassIndex < 18.5){
            System.out.println("Your under weight");
        } else if(bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            System.out.println("Normal");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30){
            System.out.println("Overweight");
        } else if (bodyMassIndex >= 30) {
            System.out.println("Obese");
        }

    }
}
