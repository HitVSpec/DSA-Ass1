class MarksOutOfBoundsException extends Exception{
    public MarksOutOfBoundsException(String text){
        super(text);
    }
}
class Student{
    private String name;
    private int marks;

    public Student(String name, int marks)throws MarksOutOfBoundsException{
        this.name = name;
        if(marks > 100){
            throw new MarksOutOfBoundsException("Marks should be lesss than 100");

        }
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
public class Q3 {
    public static void main(String[] args){
        try{
            Student s1 = new Student("A", 69);
            Student s2 = new Student("B", 110);
            Student s3 = new Student ("C", 23);
            Student s4 = new Student("D", 212);
            Student s5 = new Student("E", 99);
        }
        catch(MarksOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
