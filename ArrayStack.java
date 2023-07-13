import java.util.*;
class stack
{
    private int top;
    private int arr[];
    stack(int size)
    {
        arr = new int[size];
        top = -1;
    }
    void push(int v)
    {
        if(top == arr.length-1)
        {
            System.out.println("Stack is overflow");
            return;
        }
        else
        {
            System.out.println("Element "+v+" is pushed into the stack");
            arr[++top] = v;

        }
    }
    void pop()
    {
        int v=-1;
        if(top == -1)
        {
            System.out.println("Stack is underflow");
            return;
        }
        else
        {
            v = arr[top];
            System.out.println("Element "+v+" is popped out from the stack");
            top--;
        }


    }
    void display()
    {
        for(int i = top; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}
public class ArrayStack
{

    public static void main(String[] args)
    {
        stack s1 = new stack(3);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.display();
        s1.pop();
        s1.display();
        s1.pop();
        s1.display();
        s1.pop();
        s1.display();
        s1.pop();
    }

}




