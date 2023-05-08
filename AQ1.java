import java.util.Scanner;
class Commission{
    private double sales;

    public Commission(double sales){
        this.sales = sales;
    }
    public double getCommission(){
        if(sales < 0){
            return 0;
        }
        else if (sales < 100){
            return sales * 0.02;
        }
        else if (sales <= 5000){
            return sales * 0.05;
        }
        else{
            return sales * 0.08;
        }
    }
}
public class AQ1{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the sales Amount: ");
        double sales = x.nextDouble();

        if(sales < 0){
            System.out.println("Invalid Input");
        }
        else {
            Commission com = new Commission(sales);
            double comAmt = com.getCommission();
            System.out.println("Commission Amount: " + comAmt);
        }
    }
}