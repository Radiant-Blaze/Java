package Java.Intermediate.OOPs.IMPORTANT.Wrapper_Class.Methods;

public class Main {
    public static void main(String[] args)
    {

        // Integer.parseInt
        int intValue = Integer.parseInt("40");
        System.out.println("Integer + 10 = " + (intValue + 10));

        // Float.parseFloat
        float floatValue = Float.parseFloat("1.5");
        System.out.println("Float + 1.5 = " + (floatValue + 1.5f));

        // Double.parseDouble

        double doubleValue = Double.parseDouble("1.75");
        System.out.println("Double + 2.25 = " + (doubleValue + 2.25));

        //.toString

        Integer a = 100;
        Float   b = 12.34f;
        Double  c = 56.78;

        // Converting to String
        String strA = a.toString();
        String strB = b.toString();
        String strC = c.toString();
    }
}
