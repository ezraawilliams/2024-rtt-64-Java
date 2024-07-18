package org.percholas.introtojava;

public class MethodsEx {
    Student student;
    public static void main(String[] args) {

    }

    public Student returnStudent(){
        Student student = new Student();
        return student;
    }

    public Student returnStudent(String name){
        Student student = new Student();
        student.setFirstName(name);
        return student;
    }

    public void returnStudent(String name, int age){
        Student student = new Student();
        student.setFirstName(name);
    }
    public Student returnStudent(int age, String studentName){
        Student student = new Student();
        student.setFirstName(studentName);
        return student;
    }
}
