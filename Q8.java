import java.util.Scanner;
interface DetailedInfo{
    void display();
    int count();
}
class Q8 implements DetailedInfo{
    static int max = 100;
    String name;

    Q8(String n){
        name = n;
    }
    public void display(){
        System.out.println("Name: " + name);
    }

    public int count(){
        return name.length();
    }

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = x.nextLine();

        Q8 p = new Q8(name);
        p.display();

        System.out.println("Number of characters in name: " + p.count());
    }
}