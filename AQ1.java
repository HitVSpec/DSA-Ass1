import java.util.Scanner;
public class AQ1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = x.nextInt();
        System.out.print("Enter the value of b: ");
        int b = x.nextInt();
        System.out.print("Enter the value of c: ");
        int c = x.nextInt();

        if(a + b == c) {
            System.out.println("a + b = c is satisfied");
        }
        else {
            System.out.println("a + b = c isn't satisfied");
        }
        if(b - c == a) {
            System.out.println("b - c = a is satisfied");
        }
        else {
            System.out.println("b - c = a isn't satisfied");
        }
        if(a * b == c) {
            System.out.println("a * b = c is satisfied");
        }
        else {
            System.out.println("a * b = c isn't satisfied");
        }
    }
}
