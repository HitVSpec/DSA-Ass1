import java.util.Scanner;
class PointType{
    private double x;
    private double y;

    public PointType(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void printPoint(){
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
}
class Circle0 extends PointType{
    private double radius;

    public Circle0(double x, double y, double radius){
        super(x,y);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void printRadius(){
        System.out.println("Radius: " + this.radius);
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }
    public double getCircum(){
        return (2 * Math.PI * this.radius);
    }
}
public class AQ4{
    public static void main(String[] args){
        Scanner $ = new Scanner(System.in);

        System.out.println("Enter the Coordinates of the point:");
        double x = $.nextDouble();
        double y = $.nextDouble();

        PointType point = new PointType(x, y);
        point.printPoint();

        System.out.println("Enter Coordinates of circles center:");
        x = $.nextDouble();
        y = $.nextDouble();

        System.out.print("Enter the Radius of Circle: ");
        double radius = $.nextDouble();

        Circle0 cir = new Circle0(x, y, radius);
        cir.printPoint();
        cir.printRadius();
        System.out.println("Area: " + cir.getArea());
        System.out.println("Circumference: " + cir.getCircum());
    }
}