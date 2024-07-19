package org.percholas.introtojava;
/*
For an interface:
. Only Abstract methods - public and abstract by default
. Only final variables - public, static, and final by default
. For the methods the abstract keyword and public modifier is optional.
. For the variables they are automatically public, static and final.
. CANNOT be instantiated.
. CANNOT have constructors
. CANNOT extend other classes but they can implement other interfaces.
 */

public interface College {
    // All variables are by default public, static and final
    String COLLEGENAME = "Per Scholas";
    String Address = "23-66ST";

    void getCourseName();
    void getIAName();
    void getInstructor();
    void getProgramDuration();

    default String getCollegeName() {
        return COLLEGENAME;
    }

}
