public class findpowerofnumber {

    public static void main(String[]args)
    {
        int num=3456;
        int rem=0,pow=1;
        while(num>0)
        {
            rem=num%10;
            pow=pow*10;
            num=num/10;
        }
        System.out.println("power="+pow);
    }
    
}
