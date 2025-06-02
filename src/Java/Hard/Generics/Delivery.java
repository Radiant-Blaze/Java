package Java.Hard.Generics;

public class Delivery<T,U>
{
    T address;
    U parcel;
    double price;

    Delivery(T address, U parcel, double price)
    {
        this.address = address;
        this.parcel = parcel;
        this.price = price;
    }

    void Show_Details()
    {
        System.out.println("Address : " + address);
        System.out.println("Parcel : " + parcel);
        System.out.println("Price : " + price);
    }
}
