import java.util.*;


public class anagram {

    static boolean anagram1(String str1,String str2)
    {
                 int len1=str1.length();
                 int len2=str2.length();
                 if(len1!=len2)
                 {
                    return false;
                 } 
             char ch1[]=str1.toCharArray();
             char ch2[]=str2.toCharArray();
                
             Arrays.sort(ch1);
             Arrays.sort(ch2);
             if(Arrays.equals(ch1,ch2))
             {
                return true;
             }
             else{
                return false;
             }

    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string 1");
        String str1=sc.next();
        System.out.println("enter the string 2");
        String str2=sc.next();

        boolean ans=anagram1(str1,str2);
        if(ans)
        {
            System.out.println("given strings are anagram");
        }
        else{
            System.out.println("given strings are not anagram");
        }



        
        
    }

}
