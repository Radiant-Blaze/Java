package Java.Programs.Basic3.Shipment;

public class International_Shipment extends Shipment
{
    boolean Customs_Declaration;
    String Country_of_orign = "Pakistan";

    @Override
    void Track()
    {
        if(Customs_Declaration)
        {
            System.out.println("International Shipment from "+ Country_of_orign +  " \n Status : cleared \n Delivery Time ~14 day");
        }else
        {
            System.out.println("International Shipment from " + Country_of_orign + " \n Status : NOT cleared \n Delivery Time UNKNOWN");

        }
    }
}
