public class unsginedrightshift {
    


  static  class Solution {
        public double myPow(double x, int n) {
    //  num =n;
    
        if(n<0)
                 {
                    
                    
                n=-n;
                x= 1/x;
                }
    
    
                 
    
            double ans=1;
            while(n!=0)
            {
                if((n&1)!=0)
                {
                    ans=ans*x;
                }
    
                x*=x;
                n>>>=1;  // use for unsigned integer such as which do not have any sign 
            }
            return ans;
        }
    }


    public static void main()
    {

         Solution s = new Solution();
        double x=2.0000;
        int n=-2;
      double res= s.myPow(x,n);
      System.out.println("result ="+res);
        
    }




}
