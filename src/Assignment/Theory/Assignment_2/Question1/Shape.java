package Assignment.Theory.Assignment_2.Question1;

public class Shape
{
    double area()
    {
        return 0.0;
    }
    void display()
    {
        System.out.println("The area of the Shape is : "  + area());
    }

    public static void main(String[] args)
    {

        Circle    circle    = new Circle(2.2);
        Rectangle rectangle = new Rectangle(2.5,11);

        circle.display();
        rectangle.display();

    }

}

class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    double area()
    {
        return Math.PI * Math.pow(radius , 2);
    }
}

class Rectangle extends Shape
{
    double breadth, length;
    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area()
    {
        return length * breadth;
    }
}