package LAB6.Task1;

public class Main
{
    public static void main(String[] args)
    {
        Manager manager = new Manager();

        manager.setDetails("Babar Azam",150000);
        manager.showDetails();
        manager.displayRole();
    }
}

class Employee
{
    String name;
    int salary;


    void setDetails(String name, int salary)
    {
        this.name   = name;
        this.salary = salary;
    }

    void showDetails()
    {
        System.out.println("Name : " + name + "\nSalary : " + salary);
    }
}

class Manager extends Employee
{
    void displayRole()
    {
        System.out.println("Role : Manager");
    }
}
