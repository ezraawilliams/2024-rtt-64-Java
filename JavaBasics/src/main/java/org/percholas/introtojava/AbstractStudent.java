package org.percholas.introtojava;
/*
Abstract classes:
. can have both abstract and regular methods
. cannot be instantiated - AbstractStudent a = new AbstractStudent()
. declared using the abstract keyword
. CAN be extended by another class which will provide the implementations
 */

public abstract class AbstractStudent {
    //static final protected String COLLAGENAME = "Per Scholas";
    protected String username;
    protected String password;
    protected int rollNumber;

    // abstract methods:
    public abstract  void displayInformation();
    public abstract String[] getFullName(String[] fullName);

    // regular methods
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

}
