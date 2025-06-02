package LAB6.Task3;

public class Main
{
    public static void main(String[] args)
    {
        SportsCar sportsCar = new SportsCar("Honda",100,"NSX",307);
        sportsCar.display();
    }
}

class Vehicle
{
    String brand;
    int speed;

    Vehicle(String brand, int speed)
    {
        this.brand = brand;
        this.speed = speed;
    }

    void display()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    }
}

class Car extends Vehicle
{
    String model;

    Car(String brand, int speed,String model)
    {
        super(brand, speed);
        this.model = model;
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Model : " + model);
    }
}

class SportsCar extends Car
{
    int topSpeed;

    SportsCar(String brand, int speed, String model,int topSpeed)
    {
        super(brand, speed, model);
        this.topSpeed = topSpeed;
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Top Speed : " + topSpeed);
    }
}