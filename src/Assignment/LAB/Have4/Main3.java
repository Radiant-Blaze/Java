package Assignment.LAB.Have4;

public class Main3
{
    public static void main(String[] args)
    {
        book book1 = new book("Choco", "Charlie",2020);
        book book2 = new book("candy","anna",2112);

        book1.display();
        book2.display();

    }

}

class book
{
    String title;
    String author;
    int price;

    book(String name, String autho, int pric)
    {

        title = name;
        author = autho;
        price = pric;

    }

    void display()
    {
        System.out.println(" Title  ="+title);
        System.out.println(" Author ="+author);
        System.out.println(" Price  ="+price);
        System.out.println();
    }
}
