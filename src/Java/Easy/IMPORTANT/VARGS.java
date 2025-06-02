package Java.Easy.IMPORTANT;


public class VARGS
{

    public static void main(String[] args){

        // varargs = allow a method to accept a varying # of arguments
        //                  makes methods more flexible, no need for overloaded methods
        //                  java will pack the arguments into an array
        //                  ... (ellipsis)

        System.out.println(average(1, 2, 3, 4));

    }
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }

}
