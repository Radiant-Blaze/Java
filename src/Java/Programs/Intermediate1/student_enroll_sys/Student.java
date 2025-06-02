package Java.Programs.Intermediate1.student_enroll_sys;

public class Student
{
    /* Here we will first create some
     * variables to give them the value
     * given by the user
     * note : this is to be added in program
     */

    int     age         = -1;
    int     year        = -1;
    double  gpa         = -1;
    boolean Is_Enrolled = false;
    String  name        = "ERROR";

    Student(int age, int year, double gpa, String name)
    {
        this.age         = age;
        this.gpa         = gpa;
        this.name        = name;
        this.year        = year;
        this.Is_Enrolled = true;
    }
    
}
