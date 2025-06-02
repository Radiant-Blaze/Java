package Java.Intermediate.OOPs.Basic.Method_Better.Method_toString;

public class Main
{
    public static void main(String[] args)
    {
        Student_Info Std1 = new Student_Info("Ali", 241, 3.5);
        Student_Info Std2 = new Student_Info("Tahir", 242, 3.2);


        System.out.println(Std1); // used to string to print meaningful information
        System.out.println(Std2); // about the object instead of a hash code

        Std1.Info();
        Std2.Info();

    }
}
