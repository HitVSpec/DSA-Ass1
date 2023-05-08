import java.util.Scanner;
interface std1{
    int score1 = 0;
    int score2 = 0;
}
class std2{
    String name;
    int roll;

    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        name = x.nextLine();
        System.out.print("Enter the Roll No: ");
        roll = x.nextInt();
    }
    public void output(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}
class Test extends std2{
    int m1, m2;

    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.println("Enter the marks of 2 subjects:");
        m1 = x.nextInt();
        m2 = x.nextInt();
    }
    public void output(){
        super.output();
        System.out.println("Mark 1 " + m1);
        System.out.println("Mark 2 " + m2);

    }
}
public class Q10{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        Test test = new Test();
        test.input();
        test.output();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score 1: ");
        int score1 = x.nextInt();
        System.out.print("Enter score 2: ");
        int score2 = x.nextInt();

        int grandTotal = test.m1 + test.m2 + score1 + score2;
        System.out.println("Grand Total Mark: " + grandTotal);
        System.out.println("Total Score: " + (score1 + score2));
    }
}