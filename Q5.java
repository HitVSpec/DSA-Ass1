import java.util.Scanner;
public class Q5{
    public static int sum_of_digits(int n){
        int sum = 0;
        while(n > 0 || sum > 9){
            if(n == 0){
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = x.nextInt();
        System.out.println("The sum of digits untill a single digit is " + sum_of_digits(no));
    }
}