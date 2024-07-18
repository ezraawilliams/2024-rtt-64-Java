package introtojava2;

import org.percholas.introtojava.Student;

public class NonMatriculatedStudent extends Student {


    public NonMatriculatedStudent(){
        Student student = new Student();
        //String myFirstName = this.firstName;

    }

    public static void main(String[] args) {
        NonMatriculatedStudent student = new NonMatriculatedStudent();
     //   String myFirstName = student.firstName;
    }
}
