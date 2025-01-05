public class queue1 {
    static class queue{
         static int arr[];
         static int rear=-1;
         static int size;
       public  queue(int size)
         {
            arr=new int[size];
            this.size=size;
         }


        
         public static boolean isempty()
         {
                   return rear==-1;
         }
         public static boolean isfull()
         {
            return rear==size-1;
         }

         public static void add(int data)
         {
            if(isfull())
            {
                System.out.println("queue is full");
                return;
            }
            else{
                rear++;
                arr[rear]=data;
            }
         }
public static int remove()
{

    if(isempty())
    {
        System.out.println("queue is empty");
        return -1;
    }
    int top=arr[0];
    for(int i=0;i<rear;i++)
    {
        arr[i]=arr[i+1];
        
    }
    rear--;
    return top;
}

public static int peek()
{
              if(isempty())
              {
                System.out.println("queue is empty");
                return -1;
              }
              int top=arr[0];
              return top;
}



}

    public static void main(String[]args)
    {
        queue q=new queue(5);
        q.add(12);
        q.add(10);
        q.add(90);
        while(!q.isempty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
