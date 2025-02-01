import java.util.*;


public class prefixreverse {

    public static void main(String[]args)
    {



             String str="xyxzxe";
             StringBuilder sb=new StringBuilder();
             char ch1[]= str.toCharArray();
             char ch='z';
            int first=-1;
            for(int i=0;i<str.length();i++)
            {
                if(first==-1)
                {
                    if(str.charAt(i)==ch)
                    {
                        first= i;
                    }
                }





            }    
            
            // System.out.println(first);
            int s=0;
            int e=first;
            while(s<=e)
            {
                char temp= ch1[s];

                ch1[s]=ch1[e];
                ch1[e]=temp;
                s++;
                e--;
                
            }

            sb.append(new String(ch1));
            System.out.println(sb);



    }
    
}
