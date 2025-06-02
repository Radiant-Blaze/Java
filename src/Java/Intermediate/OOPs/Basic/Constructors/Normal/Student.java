package Java.Intermediate.OOPs.Basic.Constructors.Normal;

public class Student
{

    String      name;
    int         age;
    double      gpa;
    boolean     enrolled;

    Student( String name, int age, double gpa )
    {

        this.name       = name;
        this.age        = age;
        this.gpa        = gpa;
        this.enrolled   = true;

    }

    void info()
    {
        if ( enrolled == true)
        {
            System.out.printf("\n %s aged %d having %.2f gpa is enrolled",name,age,gpa);
        }else
        {
            System.out.printf("\n %s aged %d having %.2f gpa is not enrolled",name,age,gpa);
        }
    }
    
}
