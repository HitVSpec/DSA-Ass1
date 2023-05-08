import java.util.Scanner;

class Student {
    private int Roll;
    private String Name;
    private double DSA_Mark;

    public void getdata() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Roll No.: ");
        Roll = x.nextInt();
        System.out.print("Enter Name: ");
        Name = x.next();
        System.out.print("Enter DSA Mark: ");
        DSA_Mark = x.nextDouble();
    }

    public void showdata() {
        System.out.println("Roll No.: " + Roll);
        System.out.println("Name: " + Name);
        System.out.println("DSA Mark: " + DSA_Mark);
    }

    public double getDSA_Mark() {
        return DSA_Mark;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student[] std = new Student[5];

        for (int i = 0; i < std.length; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            std[i] = new Student();
            std[i].getdata();
        }
        Student highestDSAStudent = std[0];
        for (int i = 1; i < std.length; i++) {
            if (std[i].getDSA_Mark() > highestDSAStudent.getDSA_Mark()) {
                highestDSAStudent = std[i];
            }
        }

        System.out.println("Student with the highest DSA Mark:");
        highestDSAStudent.showdata();
    }
}