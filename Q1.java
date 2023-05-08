import java.util.Scanner;

public class Q1{
    private String area_code, exchange, number;

    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the area code: ");
        area_code = x.nextLine();
        System.out.print("Enter the exchange: ");
        exchange = x.nextLine();
        System.out.print("Enter the number: ");
        number = x.nextLine();
    }
    public void display(){
        System.out.println("("+area_code+")" + exchange +"-"+ number);
    }
    public static void main(String[] args){
        Q1 Phone1 = new Q1();
        Phone1.area_code = "212";
        Phone1.number = "767";
        Phone1.exchange = "8900";

        Q1 Phone2 = new Q1();
        Phone2.input();

        System.out.print("My number is: ");
        Phone1.display();

        System.out.print("Your number is: ");
        Phone2.display();
    }
}