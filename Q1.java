import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number greater than 2: ");
        int no = x.nextInt();
        int cnt = 0;

        while (no > 2){
            no /= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}