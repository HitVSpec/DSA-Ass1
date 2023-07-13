import java.util.Scanner;

class LinkedStack
{
    snode top = null;
    LinkedStack push(LinkedStack list)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number into stack");
        num = sc.nextInt();
        snode newnode = new snode(num);
        if(list.top == null)
        {
            list.top = newnode;
        }
        else
        {    newnode.next = list.top;
            list.top = newnode;
        }

        return list;
    }

    LinkedStack pop(LinkedStack list)
    {
        int num;
        if(list.top == null)
        {
            System.out.println("stack is empty");

        }
        else
        {    num = list.top.data;
            System.out.println("\n num"+" is popped from stack");
            list.top = list.top.next;
        }

        return list;
    }



    void display(LinkedStack list)
    {
        snode temp = list.top;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

    }


    static class snode
    {
        int data;
        snode next;
        snode(int n)
        {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        LinkedStack obj = new LinkedStack();
        obj = obj.push(obj);

        obj = obj.push(obj);

        obj = obj.push(obj);

        obj = obj.push(obj);
        obj.display(obj);

        obj = obj.pop(obj);
        obj.display(obj);
    }
}