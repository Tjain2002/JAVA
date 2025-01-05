import  java.util.*;
public class stringbuilder {



    public static void main(String[]args)
    {
        String name="tanishajain";
        StringBuilder sb=new StringBuilder(name);
        StringBuffer sbu=new StringBuffer(name);
        System.out.println("name="+name);
        System.out.println(sb);
        System.out.println(sbu);
        System.out.println("capacity="+sb.capacity());
        System.out.println("size="+sb.length());
        System.out.println("capacity of string buffer"+sbu.capacity());

        
    }
    
}
