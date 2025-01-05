import java.util.*;
public class reversestring {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        StringBuilder sb= new StringBuilder(str);
        int s=0,e=sb.length()-1;
        
            char fornt=sb.charAt(s);
            char back=sb.charAt(e);
            sb.setCharAt(fornt, back);
            sb.setCharAt(back, fornt);
            



        
        System.out.println("here is your string"+sb);


    }
    
}
