package Java.Intermediate.OOPs.Basic.Constructors.Overloaded;

public class User
{
    String name;
    String password;
    int age;

    User() {
        this.name = "";
        this.password = "";
        this.age = -1;
    }

    User(String username) {
        this.name = username;
        this.password = "";
        this.age = -1;
    }

    User(String username, String password) {
        this.name = username;
        this.password = password;
        this.age = -1;
    }

    User(String username, String password, int age) {
        this.name = username;
        this.password = password;
        this.age = age;
    }

    void info() {
        System.out.printf("The username is %s%nThe password is %s%nThe age of %s is %d%n", name, password, name, age);
    }
}