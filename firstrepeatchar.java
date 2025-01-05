
import java.util.*;
public class firstrepeatchar {


    public static String repeat(String str)
    {
                  String str1="";
                  for(int i=0;i<str.length()-1;i++)
                  {
                   
                    for(int j=i+1;j<str.length();j++)
                    {
                        if(str.charAt(i)==str.charAt( j))
                        {
                            str1=str.charAt(i)+str1;
                            return str1;
                        }

                    }
                        
                       

                
                    
                  }


return "1";
                 
                  
    }
    


    public static void main(String[]args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
       // repeat(str);
        System.out.println(repeat(str));
    }
}
