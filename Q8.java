import java.util.*;
public class Q8 {
    public static void main(String[] aargs){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int noo = x.nextInt();
        System.out.print("Reversed Number: " + reverse(noo));

    }
    public static int reverse(int no){
        int rev = 0;
        while(no > 0){
            rev = rev * 10 + no % 10;
            no /= 10;
        }
        return rev;
    }
}
