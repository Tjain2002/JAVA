public class checkstring {
    public static void main(String[] args) {
        String str = "here is digit 23";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i)-'0';
            if (ch >= 32 && ch <= 40) {
                sum = ch + sum;
            }

    
        }
        System.out.println("sum=" + sum);
    }

}
