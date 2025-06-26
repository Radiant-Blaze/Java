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

        //Value

        Integer int_Value = 100;

        //a.byteValue
        byte Integer_To_Byte = int_Value.byteValue();
        System.out.println(int_Value + " in byte : "+Integer_To_Byte);

        //a.doubleValue
        double Integer_To_Double = int_Value.doubleValue();
        System.out.println(int_Value + " in double : "+Integer_To_Double);

        //a.floatValue
        float Integer_To_Float = int_Value.floatValue();
        System.out.println(int_Value + " in floating point : "+Integer_To_Float);

        //a.intValue
        int Integer_To_Int = int_Value.intValue();
        System.out.println(int_Value + " in integer : "+Integer_To_Int);

        //a.shortValue
        double Integer_To_Short = int_Value.shortValue();
        System.out.println(int_Value + " in short : "+Integer_To_Short);

        //a.longValue
        double Integer_To_Long = int_Value.longValue();
        System.out.println(int_Value + " in Long : "+Integer_To_Long);

        //.toString

        int i = 100;
        Integer a = i;
        Float   b = 12.34f;
        Double  c = 56.78;

        // Converting to String
        String strA = a.toString();
        String strB = b.toString();
        String strC = c.toString();
    }
}
