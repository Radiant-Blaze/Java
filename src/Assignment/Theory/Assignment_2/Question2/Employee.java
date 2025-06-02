package Assignment.Theory.Assignment_2.Question2;

public class Employee
{
    String name;
    double basic_Salary;

    Employee(String name, double basic_Salary)
    {
        this.basic_Salary = basic_Salary;
        this.name = name;
    }

    double calculateSalary()
    {
        return basic_Salary;
    }

    void display()
    {
        System.out.println("Salary of " + name + " is : "+ calculateSalary() );
    }

    public static void main(String[] args)
    {
        Employee manager    = new Manager("Iftikhar Alam",250000,25000);
        Employee developer  = new Developer("Ahmed Ishfaq",100000,15000);

        System.out.println(manager.basic_Salary);

        manager.display();
        developer.display();
    }

}

class Manager extends Employee
{
    double bonus;
    Manager(String name, double basic_salary, double bonus)
    {
        super(name,basic_salary);
        this.bonus = bonus;

    }

    @Override
    double calculateSalary()
    {
        return basic_Salary + bonus;
    }
}

class Developer extends Employee
{
    double overtime;
    Developer(String name, double basic_salary, double overtime)
    {
        super(name,basic_salary);
        this.overtime = overtime;

    }

    @Override
    double calculateSalary()
    {
        return basic_Salary + overtime;
    }
}


