package Java.Intermediate.OOPs.IMPORTANT.Packages.Person;

public class Person
{
    // Fields are private (hidden)
    private String name;
    private int age;

    // Public getter/setter methods (controlled access)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // You could add validation here
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Protecting invalid data
            this.age = age;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Talha");
        p.setAge(20);
        System.out.println(p.getName() + " is " + p.getAge() + " years old.");
    }
}
