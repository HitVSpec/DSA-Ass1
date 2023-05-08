import java.util.Scanner;
class std{
    int rollNo;
    String name;
    String course;
    Scanner x = new Scanner(System.in);
    public void inputStudent(){
        System.out.print("Enter Roll No: ");
        rollNo = x.nextInt();
        System.out.print("Enter Name: ");
        name = x.next();
        System.out.print("Enter Course: ");
        course = x.next();
    }
    public void displayStudent(){
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
class Exam extends std{
    int m1, m2, m3;

    public void inputMarks(){
        System.out.println("Enter Marks of 3 Subjects: ");
        m1 = x.nextInt();
        m2 = x.nextInt();
        m3 = x.nextInt();
    }
    public void displayMarks(){
        System.out.print("Marks 1: " + m1);
        System.out.print("Marks 2: " + m2);
        System.out.print("Marks 3: " + m3);
        System.out.println("Total Marks: " + m1 + m2 + m3);
    }
}
public class Q9{
    public static void main(String[] args){
        Exam[] exams = new Exam[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Enter Details of Student " + (i + 1));
            exams[i] = new Exam();
            exams[i].inputStudent();
            exams[i].inputMarks();
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Student " + (i + 1));
            exams[i].displayStudent();
            exams[i].displayMarks();
        }
    }
}