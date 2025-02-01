public class fillstringinsteadoffloat {

    public static void main(String[] args) {

        char ch[] = { '3', '6', '7', 'a', 'b' };
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            char ch1 = ch[i];
            if (Character.isDigit(ch1)) {

                ch[i] = '#';

            }
        }
        System.out.println(ch);
    }

}
