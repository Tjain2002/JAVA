import java.util.*;
public class framwork {
    public static void main(String[]args)
    {
                 LinkedList<String>list=new LinkedList<String>();
                 list.addFirst("my");
                 list.addLast("name");

                 list.addFirst("Tanishajain");
                 String value="tannu";
                 int c=0;
    
                 //list.removeLast();
                 for(int i=0;i<list.size();i++)
                 {
                if(list.get(i)==value)
                {
                    c=1;
                    break;
                
            
                    
                }
              
                 }
                
                 if(c==1)
                 {
                    System.out.println("value is found");
                 }
                 else{
                    System.out.println("value is not found");
                 }


    }
    
}
