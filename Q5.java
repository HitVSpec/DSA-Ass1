import java.util.Scanner;
public class Q5{
    private long principal;
    private int time;
    private double rate;
    private double totalAmt;

    public Q5(){
        this.principal = 0;
        this.time = 0;
        this.rate = 0;
        this.totalAmt = 0;
    }

    public Q5(long principal, int time, double rate){
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.totalAmt = calcAmt();
    }

    public Q5(long principal, int time){
        this(principal, time, 0);
    }

    public Q5(long principal, double rate){
        this(principal, 0, rate);
    }

    public void display(){
        System.out.println("Principal: " + this.principal);
        System.out.println("Time: " + this.time);
        System.out.println("Rate: " + this.rate);
        System.out.println("Total Amount: " + this.totalAmt);
    }

    public double calcAmt(){
        return this.principal+(this.rate * this.principal * this.time) / 100;
    }

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        long principal = x.nextLong();
        System.out.print("Enter the Rate: ");
        Double rate = x.nextDouble();
        System.out.print("Enter time (in years): ");
        int time = x.nextInt();

        Q5 deposit = new Q5(principal, time, rate);
        deposit.display();
    }
}