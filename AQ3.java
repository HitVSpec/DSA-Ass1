class Distance{
    private int meters;
    private int centimeters;

    public Distance(int meters, int centimeters){
        this.meters = meters;
        this.centimeters = centimeters;
    }
    public void Display(){
        System.out.println("Distance: " + meters + " meters," + centimeters + " centimeters");
    }
    public Distance sum(Distance d){
        int totalCM = this.centimeters + d.centimeters;
        int carry = 0;

        if (totalCM >= 100) {
            totalCM -= 100;
            carry = 1;
        }

        int totalMeters = this.meters + d.meters + carry;

        return new Distance(totalMeters, totalCM);
    }
}
public class AQ3{
    public static void main(String[] args){
        Distance d1 = new Distance(5, 60);
        Distance d2 = new Distance(3, 40);

        System.out.print("Distance 1: ");
        d1.Display();
        System.out.print("Distance 2: ");
        d2.Display();

        Distance d3 = d1.sum(d2);

        System.out.print("Sum of distances: ");
        d3.Display();
    }
}