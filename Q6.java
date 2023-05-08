import java.util.Scanner;
abstract class Shape{
    abstract double area();
}
class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }
    double area() {
        return side * side;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return 0.5 * base * height;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}
public class Q6 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the side of Square: ");
        double side = x.nextDouble();
        Square sq = new Square(side);
        System.out.println("Area of Square is: " + sq.area());

        System.out.println("Enter the base and height of Triangle: ");
        double base = x.nextDouble();
        double height = x.nextDouble();
        Triangle tri = new Triangle(base , height);
        System.out.println("Area of Triangle is: " + tri.area());

        System.out.print("Enter the radius of Circle: ");
        double radius = x.nextDouble();
        Circle cir = new Circle(radius);
        System.out.println("Area of circle is " + cir.area());
    }
}