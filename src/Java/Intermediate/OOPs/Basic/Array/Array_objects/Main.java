package Java.Intermediate.OOPs.Basic.Array.Array_objects;

public class Main
{

    public static void main(String[] args) {

        Car[] cars = {new Car("Mustang", "Red"),
                              new Car("Corvette", "Blue"),
                              new Car("Charger", "Yellow")};

        for(Car car : cars){
            car.color = "black";
        }

        for(Car car : cars){
            car.drive();
        }
    }
    
}
