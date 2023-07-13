import java.util.*;
public class Q7 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Menu");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            choice = x.nextInt();

            switch (1){
                case 1:
                    System.out.print("Enter a number: ");
                    int fno = x.nextInt();
                    System.out.println("Factorial Number: " + factorial(fno));
                    break;
                case 2:
                    System.out.print("Enter the base: ");
                    int b = x.nextInt();
                    System.out.print("Enter teh power: ");
                    int p = x.nextInt();
                    System.out.println("Result" + power(b,p));
                    break;
                case 3:
                    System.out.println("Enter the two numbers: ");
                    int num1 = x.nextInt(), num2 = x.nextInt();
                    System.out.println("GCD of Two Numbers is: " + gcd(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter Decimal Number: ");
                    int dec = x.nextInt();
                    System.out.println("Binary Number is: " + DtoB(dec));
                    break;
                case 5:
                    System.out.println("Enter the two Numbers: ");
                    int p1 = x.nextInt(), p2 = x.nextInt();
                    System.out.println("Product of two numbers is: " + product(p1 , p2));
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        while(choice != 0);
    }

    public static long factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
    public static long power(int x, int n){
        if(n == 0){
            return 1;
        }
        else{
            return x * power(x, n-1);
        }
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
    public static String DtoB(int n){
        if(n == 0){
            return "0";}
        else if(n == 1){
            return "1";
        }
        else{
            return DtoB(n / 2) + Integer.toString(n % 2);
        }
    }
    public static long product(int a, int b){
        if(b == 0){
            return 0;
        }
        else{
            return a + product(a, b-1);
        }
    }
}
