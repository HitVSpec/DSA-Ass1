import java.util.*;
public class SingleLinkList
{   snode  head;
    static class snode
    {
        int data;
        snode next;
        snode(int d)
        {
            data = d;
            next = null;
        }
    }
    public static SingleLinkList create(SingleLinkList List)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        char ch;
        do
        {
            System.out.println("enter a number");
            num = sc.nextInt();
            snode newnode = new snode(num);
            if(List.head == null)
            {
                List.head = newnode;
            }
            else
            {
                snode tail = List.head;
                while(tail.next != null)
                {
                    tail = tail.next;
                }
                tail.next= newnode;

            }
            System.out.println("Do you want to add more");
            ch = sc.next().charAt(0);

        }while(ch == 'y');
        return List;

    }
    public static SingleLinkList insertFirst(SingleLinkList List, int num)
    {
        snode newnode = new snode(num);
        if(List.head == null)
        {
            List.head = newnode;
        }
        else
        {
            newnode.next = List.head;
            List.head = newnode;

        }
        return List;
    }
    public static SingleLinkList delFirst(SingleLinkList List)
    {

        if(List.head == null)
        {
            System.out.println("Deletion is not possible as List is Empty");
            List.head = null;
        }
        else
        {
            List.head = List.head.next;
            System.out.println("Deleted Succefully");
        }
        return List;
    }
    public static SingleLinkList insertLast(SingleLinkList List, int num)
    {
        snode newnode = new snode(num);
        if(List.head == null)
        {
            List.head = newnode;
        }
        else
        {
            snode tail = List.head;
            while(tail.next != null)
            {
                tail = tail.next;
            }
            tail.next= newnode;

        }
        return List;
    }
    public static SingleLinkList delLast(SingleLinkList List)
    {
        if(List.head == null)
        {
            System.out.println("Deletion is not possible as List is Empty");
            List.head = null;
        }
        else
        {
            snode temp = List.head;
            snode prevtemp = null;
            while(temp.next != null)
            {
                prevtemp = temp;
                temp = temp.next;
            }
            prevtemp.next= null;
            System.out.println("Deleted Succefully");
        }
        return List;
    }
    public static SingleLinkList insertAtAnyPos(SingleLinkList List, int num, int pos)
    {

        int nodecount = 0;
        snode tail = List.head;
        while(tail != null)
        {
            nodecount++;
            tail = tail.next;
        }
        if( pos < 1 || pos > nodecount)
        {
            System.out.println("Invalid Position to insert a node in the Link List");
            return List;
        }
        snode newnode = new snode(num);
        if( pos == 1)
        {
            List.head = newnode;

        }
        else
        {
            snode temp = List.head;
            snode prevtemp = temp;
            int i = 1;
            while(i < pos)
            {
                prevtemp = temp;
                temp = temp.next;
                i++;
            }
            prevtemp.next = newnode;
            newnode.next = temp;
        }
        return List;

    }
    public static SingleLinkList delAtAnyPos(SingleLinkList List, int pos)
    {
        int nodecount = 0;
        snode temp = List.head;
        while(temp != null)
        {
            nodecount++;
            temp = temp.next;
        }
        if( pos < 1 || pos > nodecount)
        {
            System.out.println("Invalid Position to insert a node in the Link List");
            return List;
        }
        if(List.head == null)
        {
            System.out.println("Deletion is not possible as List is Empty");
            List.head = null;
        }
        else if(pos == 1)
        {
            List.head = List.head.next;
            System.out.println("Deleted Succefully");
        }
        else
        {
            int i = 1;
            temp = List.head;
            snode prevtemp = null;
            while(i < pos)
            {
                prevtemp = temp;
                temp = temp.next;
                i++;
            }
            prevtemp.next= temp.next;
            System.out.println("Deleted Succefully");
        }
        return List;
    }

    static void display(SingleLinkList List)
    {
        snode temp = List.head;
        System.out.println("Single Link List");
        while(temp != null)
        {
            if(temp.next == null)
                System.out.print(temp.data);
            else
                System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    static void search(SingleLinkList List, int srno)
    {
        snode temp = List.head;
        if(List.head == null)
        {
            System.out.println("Link list is Empty, so searching is not possible");
            return;
        }
        int pos=0;
        while(temp != null)
        {
            pos++;
            if(temp.data == srno)
            {
                System.out.print("Element is found at "+pos+" position in the LinkList");
                break;
            }
            temp = temp.next;
        }
        if( temp == null)
            System.out.println("The given element is not found in the Link List");
    }
    static SingleLinkList sort(SingleLinkList List)
    {

        int nodecount = 0;
        snode temp = List.head;
        while(temp != null)
        {
            nodecount++;
            temp = temp.next;
        }
        if(nodecount == 0)
        {
            System.out.println("Link list is Empty, so sorting is not possible");

        }
        else
        {

            for(int i=0;  i < nodecount;  i++)
            {
                snode itemp = List.head;
                snode jtemp = List.head.next;
                for(int j=1; j < nodecount-i; j++)
                {  if(itemp.data > jtemp.data)
                {
                    int extravnm = itemp.data;
                    itemp.data = jtemp.data;
                    jtemp.data = extravnm;
                }
                    itemp = jtemp;
                    jtemp=jtemp.next;
                }
            }

        }
        return List;
    }
    static int count(SingleLinkList List)
    {
        snode temp = List.head;
        int ctr=0;
        while(temp != null)
        {
            ctr++;
            temp = temp.next;
        }
        return ctr;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        SingleLinkList list = new SingleLinkList();
        int choice;
        do
        {
            System.out.println("Single Link Menu: List of Operations");
            System.out.println("1. Creation");
            System.out.println("2. Display");
            System.out.println("3. Total node counts");
            System.out.println("4. Insertion at Begining");
            System.out.println("5. Insertion at Last");
            System.out.println("6. Insertion at any position");
            System.out.println("7. Deletion at Begining");
            System.out.println("8. Deletion at Last");
            System.out.println("9. Deletion at any position");
            System.out.println("10. Searching of a node in a Link List");
            System.out.println("11. Sorting of node values in Link List");
            System.out.println(" Enter your choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    list = create(list);
                    break;
                case 2:
                    display(list);
                    break;
                case 3:
                    System.out.println("Total number of nodes in Link List : "+count(list));
                    break;
                case 4:
                    System.out.println("enter the number which you want to add it at first position of the List");
                    int num = sc.nextInt();
                    list = insertFirst(list, num);
                    break;
                case 5:
                    System.out.println("enter the number which you want to add it at last position of the List");
                    num = sc.nextInt();
                    list = insertLast(list, num);
                    break;
                case 6:
                    System.out.println("enter the number and its position to be added into the Link List");
                    num = sc.nextInt();
                    int pos = sc.nextInt();
                    list = insertAtAnyPos(list, num, pos);
                    break;
                case 7:
                    System.out.println("Delete a node at first position of the List");
                    list = delFirst(list);
                    break;
                case 8:
                    System.out.println("Delete a node at last position of the List");
                    list = delLast(list);
                    break;
                case 9:
                    System.out.println("enter the position from where you want to delete a node from the Link List");
                    pos = sc.nextInt();
                    list = delAtAnyPos(list,pos);
                    break;
                case 10:
                    System.out.println("enter the number which you want to search in the List");
                    int srno = sc.nextInt();
                    search(list, srno);
                    break;
                case 11:
                    System.out.println("List is now sorted based on Data Values");
                    sort(list);
                    break;
                default:
                    System.out.println("Exit from Menu");
                    return;

            }
        }while(choice <= 12);
    }
}