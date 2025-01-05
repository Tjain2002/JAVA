public class convertdecimaltobinary {

    public static boolean decimal(int n) {
        int rem, ans = 0, pow = 1;

        while (n != 0) {
             rem = n % 2;
            ans = (rem * pow) + ans;
            pow = (pow * 10);
            n = n / 2;


           

        }
    String  str=Integer.toString(ans);
  //  System.out.println(str);
    int s=0,e=str.length()-1;

    while(s<e)
    {
        if(str.charAt(s)!=str.charAt(e))
        {
            return false;
        }

        s++;
        e--;
    }
    return true;
    

    }

    public static void main(String[] args) {

        int n = 9;
       if( decimal(n))
       {
        System.out.println("binary number is pallindrome");
       }

       else{
        System.out.println("number is not pallindrome");
       }
       // System.out.println("answer=" + decimal(n));
    }

}
