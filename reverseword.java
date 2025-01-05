import java.util.*;

public class reverseword {

    public static String word(String str) {
        String[] wordreverse = str.trim().split("\\s+");
        StringBuilder wordstr=new StringBuilder();
        for(int i=wordreverse.length-1;i>=0;i--)
        {
            wordstr.append(wordreverse[i]);
            if(i>0)
            {
                wordstr.append(" ");
            }
        }
return wordstr.toString();    

    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println(word(str));




    }

}
