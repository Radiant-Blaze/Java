package Practice_Final.Q1;

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
        Employee employee[] =
                    {
                        new Part_Time_Employee("Basit Khan", "basitkhan9874@gamil.com", 1500, 105),
                        new Full_Time_Employee("Tachibana Kurumi", "tachimi42@gmail.com", 300000, 75000)
                    };

        for (Employee emp : employee)
        {
            emp.Calculate_Pay();
            System.out.println();
        }
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
        System.out.println("Total Salary : " + salary);
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
        System.out.println("Total Salary : " + salary);
    }
}