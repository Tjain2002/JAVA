import java.util.*;
public class pallindrome{
    boolean checkpallindrome(String str)
    {
                int s=0;
                int e=str.length()-1;
                while(s<e) 
                {
                    if(str.charAt(s)!=str.charAt(e))
                    {
                        return false;
                    }
                    s++;
                    e--;
                }
                return true;
                    
                
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        pallindrome p =new pallindrome();

        if(p.checkpallindrome(str))
        {
            System.out.println("given string is pallindrome");
        }
        else{
            System.out.println("given string is not pallindrome");
        }
        

        
        
    }
}