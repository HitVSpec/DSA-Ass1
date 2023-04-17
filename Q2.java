import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the weight(kg): ");
        double w = x.nextDouble();
        System.out.print("Enter the height(m): ");
        double h = x.nextDouble();

        String b = null;
        double bmi = w / (h * h);

        if(bmi < 18.5) {
            b = "Underweight";
        }
        else if(bmi >= 18.5 && bmi < 25){
            b = "Normal Weight";
        }
        else if(bmi >= 25 && bmi < 30){
            b = "Overweight";
        }
        else if(bmi >= 30){
            b = "Obese";
        }
        System.out.println("The person is " + b);
    }
}