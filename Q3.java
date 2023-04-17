import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = x.nextInt();
        int temp = a, d = 0, sum = 0, pro = 1;

        while(temp > 0){
            d = temp % 10;
            sum += d;
            pro *= d;
            temp /= 10;
        }
        if(sum == pro){
            System.out.println(a + " is a spy number");
        }
        else{
            System.out.println(a + " is not a spy number");
        }
    }
}