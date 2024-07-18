package org.percholas.introtojava;
/*
This is the parent, super, base class
 */

public class Student {
    //fields/features/class variables/attributes - variables that will hold information about a Student:
    // Non-static fields - instance fields/atrributes
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String address;
    private double grade;
    private long socialSecurityNumber;

    /*
    Static fields - belong to the class and not to any particular object;
    You can use the CLASS NAME to gain access to them
    We have attributes that are SHARED among those objects
     */
    static final String schoolName = "Per Scholas";

    /*
    Constructors - special method - same name as the class; used to create
    or CONSTRUCT objects of that class:
    Scanner scanner = new Scanner(System.in);
    String myString = new String();
    Constructor overloading
     */

    //All arguments constructor:
    public Student (String firstName, String middleName, String lastName,
                    int age, String address, double grade,
                    long socialSecurityNumber) {
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.age=age;
        this.address=address;
        this.grade=grade;
        this.socialSecurityNumber=socialSecurityNumber;
    }

    //No args constructor/ default constructor
    public Student(){

    }

    public Student(String firstName, String middleName, String lastName){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
    }

    public String fullName(){
        String intro = "This is my name: "; //local variable
        return intro + firstName +" "+ middleName +" "+ lastName;
    }

    //Setters - mutator methods - allow us to give values to those attributes:

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setGrade(double grade){
        this.grade=grade;
    }
    public void setSocialSecurityNumber(long socialSecurityNumber){
        this.socialSecurityNumber=socialSecurityNumber;
    }

  /*  public void setSchoolName(String schoolName){
        Student.schoolName =schoolName;
    }*/

    public String getSchoolName(){
        return Student.schoolName;
    }

    //Getters - accessor methods - allow us to access the values of those attributes:
    public String getFirstName()   {
        return firstName;
    }
    public String getMiddleName()   {
        return middleName;
    }
    public String getLastName()   {
        return lastName;
    }
    public int getAge()   {
        return age;
    }
    public String getAddress()   {
        return address;
    }
    public double getGrade()   {
        return grade;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public static void printSchoolName(){
        System.out.println("The name of the school is: "+Student.schoolName);
    }
}
