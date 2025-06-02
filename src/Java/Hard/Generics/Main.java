package Java.Hard.Generics;

public class Main
{
    public static void main(String[] args)
    {
        Delivery<Integer, String> parcel1 = new Delivery<>(123,"number 1",12345.00);
        Delivery<String, Integer> parcel2 = new Delivery<>("House 123",1,12345.00);

        parcel1.Show_Details();
        System.out.println();
        parcel2.Show_Details();
    }
}

// here we used two generics one for address and 2 for parcel no also i used a double as non-generic to show we
// can we it too (Non-Generic with Generic)
