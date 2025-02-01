// import javax.management.InvalidAttributeValueException;
import java.util.*;

public class linkedlistiplementend {

static Node head;
 static class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
 }


 public void insertatbeg(int data)
 {

    Node newNode = new Node(data);
    if(head==null)
    {
              head=newNode;
              return;
    }
    newNode.next=head;
    head=newNode;
 }

 public void insertatend(int data)
 {
    Node newNode = new Node(data);

    if(head==null)
    {
        head=newNode;
        return;
    }
    Node currnode=head;
    while(currnode.next!=null)
    {
        currnode=currnode.next;
    }

    // currnode.next=head;
    // newNode=currnode;
    currnode.next=newNode;
    
 }

 public  void insertatpos(int data,int pos)
 {
    Node newNode = new Node(data);
    // if(head==null)
    // {
    //     head=newNode;
    //     return;
    // }
if(pos==1)
{
    newNode.next=head;
    head=newNode;
    return;
}
    Node currnode=head;
    for(int i=1;i<pos-1&& currnode!=null;i++)
    {
        currnode=currnode.next;
    }
    // if(currnode==null)
    // {
    //     System.out.println("enter the position again");
    //     // return;
    // }
    
   

    try{
        if(currnode==null)
        {
            // System.out.println("enter the again position");
            throw new NullPointerException("it will throw null pointer Exception");

        }

     else   if(pos<0)
        { 
            throw new ArithmeticException("this is negative index enter the again");

        }
        else{
            Node temp=currnode.next;
            currnode.next=newNode;
            // currnode=temp;
            newNode.next=temp;
        }
    }
    catch(NullPointerException e)
    {
            System.out.println(e);
            System.out.println("run the rest of the code");
    }
    catch(ArithmeticException e)

    {
System.out.println(e);
System.out.println("rest of the code");
    }
    

 
    
 }





 public void deleteatbeg()
 {
    if(head==null)
    {
        return;
    }
    System.out.println("here is node will delete");
    head=head.next;
    

 }
 public void deleteatend()
 {
    if(head==null)
    {
        System.out.println("linked list is empty");
        return;
    }
    if(head.next==null)
    {
        head=null;
        return;
    }
    Node first= head;
    Node second=head.next;
   while(second.next!=null)
   {
    first=first.next;
    second=second.next;

   }
first.next=null;

 }

 public void display()
 {
    if(head==null)
    {
        System.out.println("empty");
        return;
    }
    Node currnode=head;
    while(currnode!=null)
    {
        System.out.println(currnode.data);
        currnode=currnode.next;
    }
 
 }


    public static void  main(String[]args)
    {
        linkedlistiplementend ll = new linkedlistiplementend();
        ll.insertatbeg(20);
        ll.insertatbeg(34);
        
        ll.insertatbeg(64);
        ll.insertatbeg(84);
        ll.insertatbeg(94);
        ll.insertatend(100);
        // ll.display();
        ll.insertatpos(120, -4);
        //   ll.display();
        // ll.deleteatend();
        // ll.deleteatend();
        // ll.deleteatend();
        // ll.deleteatend();
        // ll.deleteatend();
        // ll.deleteatend();

      
        // ll.deleteatbeg();
        ll.display();


    }
    
}
