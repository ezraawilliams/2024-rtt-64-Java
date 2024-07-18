package org.percholas.introtojava;

public class StudentDriver {
    public static void main(String[] args) {
        /*String name = "Per Scholas";
        Student.schoolName= name;*/
        //Create a student object/instance :
        Student student = new Student();//using my no args constructor
        student.setFirstName("John");
        student.setMiddleName("Alex");
        student.setLastName("Smith");
        student.setAge(25);
        student.setAddress("123 ABC Lane");
        student.setGrade(90);
        student.setSocialSecurityNumber(123456789);
        //we are using the getters to ACCESS the student information:
        printStudentInfo(student);//call the method
        Student.printSchoolName();

        MatriculatedStudent matriculatedStudent = new MatriculatedStudent();
        matriculatedStudent.setFirstName("Charu");
        matriculatedStudent.setMiddleName("");
        matriculatedStudent.setLastName("Singhal");
        matriculatedStudent.setAge(20);
        matriculatedStudent.setAddress("123 ABC Lane");
        matriculatedStudent.setGrade(90);
        matriculatedStudent.setSocialSecurityNumber(1234567810);
        matriculatedStudent.setEnrolled(true);
        System.out.println(matriculatedStudent.fullName());

    }
    public static void printStudentInfo(Student student) {
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Social Security Number: " + student.getSocialSecurityNumber());
    }
}
