package org.percholas.introtojava;
/*
The implementing class:
. MUST provide logic/implementation for EVERY abstract method.
. MUST be substituted wherever the Abstract Class is needed.
. MUST also provide logic for Interface implementation.
 */

public class StudentService extends AbstractStudent implements College {
    // Assume this gpa is coming from Database
    private double gpa = 4.2;

    public StudentService() {}
    @Override
    public void displayInformation() {
        System.out.println("Welcome to " + this.COLLEGENAME);
        System.out.println("Your username is " + this.username + " and password is " + this.password);
        System.out.println("Your roll number is "+ this.rollNumber + " and You got  " + this.gpa);
    }

    @Override
    public String[] getFullName(String[] name) {
        String[] fullName = name;
        return fullName;
    }

    @Override
    public void getCourseName()
    {
        System.out.println("Full Stack Java development");   }
    public void getIAName() {
        System.out.println("Do not Assign");    }
    public void getInstructor()
    {
        System.out.println("Your Instructor name is James"); }
    public void getProgramDuration()
    {
        System.out.println("Program Duration is approximately 15 week"); }


}
