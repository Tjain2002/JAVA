import java.util.*;


public class convertlistintostring {

    public static void main(String[]args)
    {
    //    List<String>list=["geeks"];
        List<String>list=new ArrayList<>(Arrays.asList("Apple"));
        // StringBuilder str1=new StringBuilder("");
        String str1="Apple";
        // boolean ans= list.subList(0, 0);
       
String str[]={""};
        for(int i=0;i<list.size();i++)
        {
str= list.toArray(new String[i]);
        }

        boolean ans=false;
        for(int i=0;i<str.length;i++){
        if(str1.matches(str[i]))
        {
ans=true;
        }


        
        





    
        
       
    }
    if(ans)
    {
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }

    }
    
}
