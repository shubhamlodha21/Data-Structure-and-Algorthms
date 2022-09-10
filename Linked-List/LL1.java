//Linked-List Basics

public class LL1 {
    public static void main(String[] args)
    {
        Node Head;
        Node FirstNode = new Node(11);
        Head = FirstNode;

        Node SecondNode = new Node(21);
        Node ThirdNode = new Node(51);

        //Pointing/Linking of Nodes-
        FirstNode.next = SecondNode;
        SecondNode.next = ThirdNode;

        //Priting
        System.out.println("FirstNode Data is:"  +FirstNode.data);
        System.out.println("Head Data is:" +Head.data);
        System.out.println("Second Data is:"+SecondNode.data);
        System.out.println("Second Data using Head  is:" +FirstNode.next.data);
        System.out.println("FirstNode Address is:" +FirstNode.next);
        System.out.println("Head Address is:" +Head.next);
        System.out.println("SecondNode Address is:" + SecondNode.next);
        System.out.println("ThirdNode Addresss is" +ThirdNode.next);
    }   
}


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