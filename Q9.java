import java.util.*;
public class Q9 {
    public static void main(String[] arhs){
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = x.nextInt();
        System.out.print("The fibo no is: " + fibo(n));
    }
    public static int fibo(int n){
        if( n <= 1){
            return n;
        }
        else{
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
