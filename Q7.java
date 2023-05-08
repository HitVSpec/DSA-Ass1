import java.util.Scanner;
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int Eid;
    double salary;
    public Employee(String name, int age, int Eid, double salary){
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }
    
    public void empDisplay(){
        System.out.println("Employee Details: ");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Id: " + Eid);
        System.out.println("Employee Salary: " + salary);
    }
    public class Main{
        public static void main(String[] args){
            Scanner x = new Scanner(System.in);

            System.out.print("Enter employee name: ");
            String name = x.nextLine();
            System.out.print("Enter the employee age: ");
            int age = x.nextInt();
            System.out.print("Enter the employee id: ");
            int Eid = x.nextInt();
            System.out.print("Enter the employee salary: ");
            double salary = x.nextDouble();

            Employee emp = new Employee(name, age, Eid, salary);
            emp.empDisplay();

        }
    }
}
