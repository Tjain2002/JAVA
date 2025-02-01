import java.util.*;

public class segmentedstring {

      public static    int res(String str, ArrayList<String>dictionary)


         {
   
char ch[] = new char[100];
ArrayList<Character>ans= new ArrayList<>();

int j=0;
// Arrays.sort(null);
            for(int i=0;i<dictionary.size();i++)
            {
                String newstr = dictionary.get(i);
                while(j<newstr.length())
                {
                    if(newstr.charAt(j)== str.charAt(j))
                    {
                        ans.add(newstr.charAt(j));
                        j++;
                    }

                }


            }

            System.out.println(ans);


            return 0;
         }






    public static void main(String[]args)
    {
        String str ="ilike";
        ArrayList<String>dictionary= new ArrayList<>();
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("sam");
        res(str, dictionary);

 
    }
    
}
