package LABS.Lab8.Q2;

public class Main
{
    public static void main(String[] args)
    {
        AC ac     = new AC();
        Fan fan    = new Fan();
        Light light  = new Light();

        ac.turnOn();
        ac.turnOff();
        System.out.println();

        fan.turnOn();
        fan.turnOff();
        System.out.println();

        light.turnOn();
        light.turnOff();
    }
}

class AC implements SmartDevice
{

    @Override
    public void turnOn() {System.out.println("AC is turning on...");}

    @Override
    public void turnOff() {System.out.println("AC is turning off...");}
}

class Fan implements SmartDevice
{

    @Override
    public void turnOn() {System.out.println("Fan is turning on...");}

    @Override
    public void turnOff() {System.out.println("Fan is turning off...");}
}

class Light implements SmartDevice
{

    @Override
    public void turnOn() {System.out.println("Light is turning on...");}

    @Override
    public void turnOff() {System.out.println("Light is turning off...");}
}

