public class LL2 {

    //InsertAtFirst
    static Node InsertAtFirst(Node Head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = Head;
        Head = newNode;

        return Head;
    }

    //InsertAtEnd
    static Node InsertAtEnd(Node Head, int data)
    {
        Node newNode = new Node(data);

        if(Head==null)//If LL is Empty
        {
            Head = newNode;
            return newNode;
        }

        Node temp = Head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        
        temp.next = newNode;
        return Head;
    }

    //InsertAtPos
    static Node InsertAtPos(Node Head, int data, int pos)
    {
        Node newNode =new Node(data);
        Node temp = Head;

        //InValid Position

        //First
        if(pos==1)
        {
            InsertAtFirst(Head, data);
        }

        //Last
        //if(pos==)

        //Between
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        return Head;


    }

    //Count of total nodes 
    static int Size(Node Head)
    {
        Node temp = Head;
        int cnt= 0;

        while(temp!=null)
        {
            temp= temp.next;
            cnt++;
        }

        return cnt;
    }

    //PrintNodes
    static void PrintList(Node Head)
    {
        if(Head==null)
        {
            System.out.println("LL is Empty..!");
            return;
        }

        Node temp= Head;

        while(temp!=null)//Last Node having NULL at next.
        {
            System.out.print(temp.data + "==>");
            temp=temp.next;
        }

        System.out.print("NULL");    
        System.out.println();
    }

    public static void main(String[] args) {
        Node Head = null;

        Head = InsertAtEnd(Head, 11);
        Head = InsertAtEnd(Head, 21);
        Head = InsertAtEnd(Head, 51);
        Head = InsertAtEnd(Head, 101);
        Head = InsertAtFirst(Head, 05);
        Head = InsertAtFirst(Head, 01);
        Head = InsertAtPos(Head,75,5);
        

        PrintList(Head);

        System.out.println("Size of LL is:" + Size(Head));

    }  
}

//Declaration_Of_Node
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}