import java.util.Scanner;
class restaurentMeal{
    String name;
    double price;

    public restaurentMeal(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public void Display(){
        System.out.println("Meal Name: " + name);
        System.out.println("Meal Price: " + price);
    }
}
class HotelService{
	protected String name;
	protected double fee;
	protected int roomNo;

    public HotelService(String name, double fee, int roomNo){
        this.name = name;
        this.fee = fee;
        this.roomNo = roomNo;
    }
    public String getName(String name){
        return name;
    }
    public double getFee(Double fee){
        return fee;
    }
    public int getRoomNo(int roomNo){
        return roomNo;
    }
    public void Display(){
        System.out.println("Service Name: " + name);
        System.out.println("Service Fee: " + fee);
        System.out.println("Room Number: " + roomNo);
    }
}
class RoomServiceMeal extends HotelService{
    private double total;

    public RoomServiceMeal(String name, double price, int roomNo) {
        super(name, price, roomNo);
        this.name = "room service";
        this.fee = 24.0;
        this.roomNo = roomNo;
        this.total = price + fee;
    }

    public void Display() {
        super.Display();
        System.out.println("Service Name: " + getName(name));
        System.out.println("Service Fee: " + getFee(fee));
        System.out.println("Room Number: " + getRoomNo(roomNo));
        System.out.println("Total: " + total);
    }
}
public class AQ5{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter meal name: ");
        String mealName = x.nextLine();
        System.out.print("Enter meal price: ");
        double mealPrice = x.nextDouble();
        x.nextLine();
        System.out.print("Enter room number: ");
        int roomNumber = x.nextInt();
        RoomServiceMeal meal = new RoomServiceMeal(mealName, mealPrice, roomNumber);
        meal.Display();
    }
}