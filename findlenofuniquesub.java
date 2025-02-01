import java.util.Arrays;

public class findlenofuniquesub {


     public  static int longestUniqueSubstr(String s) {
        // code here
        
        // ArrayList<String>res= new ArrayList<>();
        // ArrayList<Character>res= new ArrayList<>();
    StringBuilder sb = new StringBuilder("");
        
        char ch[]= s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]!=ch[i+1])
            {
                sb.append(ch[i]);
            }
        }
        

    if(sb.charAt(sb.length()-1)!= ch[ch.length-1])
    {
        sb.append(ch[ch.length-1]);
    }
    // System.out.print(sb);

        return sb.length();
    }

    public static void  main(String[]astr)
    { 
        String str ="abcdefabcbb";
      int res=  longestUniqueSubstr(str);
      System.out.println(res);

    }

    
}
