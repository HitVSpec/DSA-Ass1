import java.util.Scanner;
public class Q6 {
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = x.nextInt();
        boolean result = isOdd(num);
        if (result) {
            System.out.println(num + " is an odd number");
        } else {
            System.out.println(num + " is not an odd number");
        }
    }
}