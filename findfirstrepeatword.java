
import java.util.*;

public class findfirstrepeatword {

    public static void firstrepeat(String str)



    {
        char ch[]=str.to

        String newstr[] = str.split("\\s+");

        StringBuilder word = new StringBuilder();

        int c = 0;
        int flag = 0;
        for (int i = 0; i < newstr.length; i++) {
            for (int j = i + 1; j < newstr.length; j++) {
                if (newstr[i].equals(newstr[j])) {
                    word.append(newstr[i]);
                    System.out.println(word);
                    return;

                }
            }
        }

        System.out.println("no repeat");

        // return "a";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        firstrepeat(str);

    }
}
