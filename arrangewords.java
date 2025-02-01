import java.util.*;

public class arrangewords {

    public static void main(String[] args)

    {

        String str[] = { "dog", "cat", "dog", "animal", "lion" ,"lion"};
        
        int k=0;
        ArrayList<String> ans = new ArrayList<>();
        Arrays.sort(str);
        for (int i = 0; i < str.length-1; i++) {
            if (str[i] == str[i + 1]) {
                

                ans.add(str[i]);
            
                
            }
            

        }
        String str1[]= new String[ans.size()];
        // str1= ans.toArray(str1);

        for(int i=0;i<ans.size();i++)
        {
            str1[i]=ans.get(i);
        }



        for(int i=0;i<str1.length;i++)
        {
            System.out.println(str1[i]);
        }



        // System.out.println(ans);

        StringBuilder sb = new StringBuilder();
        sb.append(ans);
        
        System.out.println("value of 0="+(~0));


    }

}
