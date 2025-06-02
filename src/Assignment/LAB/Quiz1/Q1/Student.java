package Assignment.LAB.Quiz1.Q1;

public class Student
{
    String name;
    int rollNumber;
    String grade;

    Student(String name, int roll , String grade)
    {
        this.name = name;
        this.grade = grade;
        this.rollNumber = roll;

    }

    void displayInfo()
    {
        System.out.println(" Name       : " +name);
        System.out.println(" Roll no    : CYS-" +rollNumber);
        System.out.println(" Grade      : " +grade);
    }

}
