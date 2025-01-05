import java.util.*;
public class array {



    public static void main(String[]args)
    {
ArrayList<Integer>mylist=new ArrayList<Integer>();
mylist.add(0);
mylist.add(1);
mylist.add(10);
//System.out.println(" "+mylist+" ");
mylist.add(0,3);
for(int i=0;i<mylist.size();i++)
{
    System.out.println(mylist.get(i));



    }

    
 Collections.sort(mylist);
 System.out.println(mylist);   
}
}