public class findumofdigit {



 static   int carry(int num1,int num2)
    {

        int sum=0;
        int c=1;
        int rem1=0,rem2=0;
        while(num1>=0 || num2>=0)
        {
            // int c=1;
            rem1= num1%10;
            num1=num1/10;
            rem2=num2%10;
            num2=num2/10;
            sum= rem1+rem2+c;
            if(sum>9)
            {
                c++;
                // sum=rem1+rem2+c;
                // System.out.println(c);
        
            
            }
            else
            {
                c=0;
            }
            
        
          return c;   
            // System.out.println(c);
        }
        // System.out.println(c);
        // return c;


return 0;


    }

    public static void main(String[]args)
    {
          int num1=293;
          int num2=23;    
          int n=carry(num1,num2);
          System.out.println(n);

    }
    
}
