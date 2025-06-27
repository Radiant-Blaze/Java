package Final.Q1;

public class Employee
{
    String name,email;
    double salary;

    Employee(String name, String email)
    {
        this.email = email;
        this.name = name;
    }
    void Calculate_Pay()
    {
        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);
    }

    double Set_Salary()
    {
        return salary;
    }

    public static void main(String[] args)
    {
        Employee employee1 = new Part_Time_Employee("Basit Khan","BasitKhan4381@gmail.com",1500,150);
        Employee employee2 = new Full_Time_Employee("Hifumi Yamaguchi","HifumiDaisuki4488@gmail.com",300000,75000);

        employee1.Calculate_Pay();
        System.out.println();
        employee2.Calculate_Pay();
    }
}

class Full_Time_Employee extends Employee
{
    double fixed_salary, bonus;

    Full_Time_Employee(String name, String email, double fixed_salary, double bonus)
    {
        super(name, email);
        this.bonus = bonus;
        this.fixed_salary = fixed_salary;
        this.salary = Set_Salary();
    }

    @Override
    double Set_Salary()
    {
        return (fixed_salary + bonus);
    }

    @Override
    void Calculate_Pay()
    {
        super.Calculate_Pay();
        System.out.println("Total Salary : " + salary + " Rs. Only");
    }
}

class Part_Time_Employee extends Employee
{
    double hourly_pay;
    int hours_worked;

    Part_Time_Employee(String name, String email, double hourly_pay, int hours_worked)
    {
        super(name, email);
        this.hours_worked = hours_worked;
        this.hourly_pay = hourly_pay;
        this.salary = Set_Salary();
    }

    @Override
    double Set_Salary()
    {
        return (hourly_pay*hours_worked);
    }

    @Override
    void Calculate_Pay()
    {
        super.Calculate_Pay();
        System.out.println("Total Salary : " + salary + " Rs. Only");
    }
}