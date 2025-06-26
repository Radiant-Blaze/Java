package Java.Intermediate.OOPs.IMPORTANT.Interface;

public class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("*The rabbit is running away*");
    }
}

class Baby_Rabbit extends Rabbit
{
    @Override
    public void flee() {
        System.out.println("*Baby Rabbit is fleeing*");
    }
    public void Snuggle() {
        System.out.println("Baby snuggling with mama");
    }
}