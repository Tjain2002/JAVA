import java.util.*;

public class findlargewordlength {

    public static void main(String[] args) {

        String name = "My name is  Tanisha jain";

        String str[] = name.split("\\s+");
        String min = str[0];
        String max = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max.length()) {
                max = str[i];
            }

            if (str[i].length() < min.length()) {
                min = str[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
