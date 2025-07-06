package Java.Hard.Inner_classes.Local_Inner;

class Test
{
    void display()
    {
        System.out.println("In the outer class");

        class Message
        {
            void display()
            {
                System.out.println("In the inner class");
                System.out.println(
                        "Object must be made in parent as the main class "+
                        "don't have the scope to see this method");
            }

        }

        //precisely here only we can access the inner class, outside methods don't know we have a child
        Message message = new Message();
        message.display();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        //outside class it don't know the contents of test
        Test test = new Test();
        test.display();
    }
}
