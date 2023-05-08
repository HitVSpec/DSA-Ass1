import java.util.Scanner;
class Book{
    private String BName;
    private int BEdition;
    private double BPrice;

    public Book(String BName, int BEdition, double BPrice){
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }

    public void Display(){
        System.out.println("Book Name: " + BName);
        System.out.println("Book Edition: " + BEdition);
        System.out.println("Book Price: " + BPrice);
    }

    public double getBPrice(){
        return BPrice;
    }
}
public class AQ2{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        Book[] books = new Book[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Enter the Book Name: ");
            String name = x.nextLine();
            System.out.print("Enter the Book Edition: ");
            int ed = x.nextInt();
            System.out.print("Enter the Price of the Book: ");
            double price = x.nextDouble();
            x.nextLine();

            books[i] = new Book(name, ed, price);
        }
        double maxPrice = 0;
        Book maxBook = null;

        for (int i = 0; i < 5; i++) {
            books[i].Display();

            if (books[i].getBPrice() > maxPrice) {
                maxPrice = books[i].getBPrice();
                maxBook = books[i];
            }
        }
        System.out.println("The book with the maximum price is:");
        maxBook.Display();
    }
}