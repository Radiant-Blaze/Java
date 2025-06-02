package Java.Intermediate.OOPs.IMPORTANT.Abstraction;

public class Main {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        //                   Abstraction is the process of hiding implementation details
        //                   and showing only the essential features.
        //                   Abstract classes CAN'T be instantiated directly.
        //                   Can contain 'abstract' methods (which must be implemented)
        //                   Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);


        circle.display();
        triangle.display();


        System.out.println(circle.area());
        System.out.println(triangle.area());
    }
}