import java.util.*;

public class checkvowelsubs {
    public static void main(String[] args) {

        String str = "aeiouu";
        HashSet<Character> set = new HashSet<>();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {

            set.clear();
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    set.add(ch);
                    if (set.size() >= 5) {
                        cnt++;
                        // set.clear();
                    }

                } else {
                    break;
                }
            }

        }

        System.out.println(cnt);

    }

}
