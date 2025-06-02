package Java.Programs.Basic3.Shipment;

public class Priority_Shipment extends Shipment
{
    int Priority_Level;

    @Override
    void Track()
    {
        if(Priority_Level == 1)
        {
            System.out.println("Priority Shipment lv. 1 \n Delivery Time ~3 day");
        }else if(Priority_Level == 2)
        {
            System.out.println("Priority Shipment lv. 2 \n Delivery Time ~2 day");
        }else if(Priority_Level == 3)
        {
            System.out.println("Priority Shipment lv. 3 \n Delivery Time ~1 day");
        }
    }
}
