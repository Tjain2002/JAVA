import java.util.*;

public class reverseeachword {

    public static void reverse(String str) {

        String newstr[] = str.split("\\s+");

        // char ch[] = new char[str.length()];
        StringBuilder   ans= new StringBuilder("");
        // ArrayList<String> newstr1 = new ArrayList<>();

        for(String word:newstr)
        {
            char ch[]= word.toCharArray();
            int s=0,e=ch.length-1;
            while(s<e)
            {
                char temp=ch[s];
                ch[s]=ch[e];
                ch[e]=temp;
                s++;
                e--;

            }
            ans.append(new String(ch)).append(" ");
        } 
        System.out.println(ans);

        // Collections.reverse(newstr1);
        // System.out.println(newstr1);

    }

    public static void main(String[] args) {
        String str1 = "jack and jill went up a hill";
        reverse(str1);
    }

}
