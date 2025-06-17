package Java.Intermediate.OOPs.IMPORTANT.Interface;

public class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("*The rabbit is running away*");
    }
}

class Baby_Rabbit extends Rabbit
{
}