package org.percholas.introtojava;

import java.util.Arrays;

public class StudentRunner {
    public static void main (String [] args) {
        AbstractStudent student = new StudentService();
        student.setUsername("Mike123");
        student.setPassword("password1234567");
        student.setRollNumber(0024);
        student.displayInformation();
        String[] name = {"Mike", "Gabriel"};
        System.out.println(Arrays.toString(student.getFullName(name)));
        StudentService st = new StudentService();
        st.getCourseName();
        st.getInstructor();
        st.getIAName();
        st.getProgramDuration();
    }

}
