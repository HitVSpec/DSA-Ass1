import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        try{
            System.out.print("Enter your lucky number: ");
            int ln = x.nextInt();
            if(ln < 0){
                throw new NumberFormatException();
            }
            System.out.println("Your Lucky Number is: " + ln);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Input. Please Enter a Positive number");
        }
    }
}
