public class checkString1 {

    public static void main(String[] args)

    {
        String name[] = { "aa","me ", "is ", "Tanisha" };
        StringBuilder str = new StringBuilder("");
        for (String ch : name)

        {
            if (ch.length() >= 2) {
                if (ch.charAt(0) == ch.charAt(ch.length() - 1)) {
                    str.append(ch);
                }

            }

        }
        String str1="abc";


        str1.toLowerCase()
               System.out.println("str=" + str);

    }
}
