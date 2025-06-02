package Java.Intermediate.OOPs.Basic.Method_Better.Method_toString;

public class Student_Info
{
    String name;
    int roll_no;
    double gpa;

    Student_Info(String Std_name, int Std_roll, double Std_gpa)
    {
        this.gpa = Std_gpa;
        this.name = Std_name;
        this.roll_no = Std_roll;
    }

    @Override
    public String toString()
    {
        return " This will display the info of " + name;
    }

    void Info()
    {
        System.out.println(" Name : " + name + "\n Roll no : " + roll_no + "\n GPA : " + gpa);
    }

}
