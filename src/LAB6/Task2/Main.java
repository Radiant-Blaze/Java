package LAB6.Task2;

public class Main
{
    public static void main(String[] args)
    {
        Senior_Manager seniorManager = new Senior_Manager("Saleem Sheikh",15000,"R&D",10);
        seniorManager.Display();
    }
}

class Employee
{
    String name;
    int salary;

    Employee(String name, int salary)
    {
        this.name   = name;
        this.salary = salary;
    }
}

class Manager extends Employee
{
    String departmentInfo;
    Manager(String name, int salary, String departmentInfo)
    {
        super(name,salary);
        this.departmentInfo = departmentInfo;
    }
}


class Senior_Manager extends Manager
{
    int teamSize;

    Senior_Manager(String name, int salary, String departmentInfo, int teamsize)
    {
        super(name,salary,departmentInfo);
        this.teamSize = teamsize;
    }

    void Display()
    {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department Info : " + departmentInfo);
        System.out.println("Team Size : " + teamSize);
    }
}