package org.percholas.introtojava;
/*
This is a subclass/child/derived class of Student
A MatriculatedStudent IS-A Student
This class can have only one parent - single inheritance
composition - the HAS-A relationship
 */

public class MatriculatedStudent extends Student{
    //Student student;
    /*
    It extends Student because it inherits the attributes and behavior,
    however, it can also have it's own attributes and behavior
     */
    private boolean enrolled;

    public MatriculatedStudent(){
        super();
        // student.firstName="Ezra";
    }

    public MatriculatedStudent(String firstName, String middleName, String lastName,
                               int age, String address, double grade,
                               long socialSecurityNumber){
        super(firstName, middleName, lastName, age, address, grade,
                socialSecurityNumber);
    }

    public void setEnrolled(boolean enrolled){
        this.enrolled = enrolled;
    }

    public boolean getEnrolled(){
        return enrolled;
    }
    @Override //this is no longer mandatory
    public String fullName(){
        //Only the implementation changes when you are overriding;

        return "Matriculated Student: " + super.fullName();
    }

}
