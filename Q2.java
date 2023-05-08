import java.util.Scanner;
class Complex {
    private double real;
    private double imag;

    public void setData(double r, double i) {
        real = r;
        imag = i;
    }

    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public Complex add(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;
        return result;
    }
}

public class Q2{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        int a = x.nextInt(), b = x.nextInt();
        int c = x.nextInt(), d = x.nextInt();

        c1.setData(a, b);
        c2.setData(c, d);

        Complex sum = new Complex();
        sum = sum.add(c1, c2);

        System.out.print("Sum of ");
        c1.display();
        System.out.print("and ");
        c2.display();
        System.out.print("is ");
        sum.display();
    }
}