public class recursivecountdigit {

    static int cnt(String n,int k)
    {
String str="";
        // StringBuilder str =new StringBuilder("");
           while(k!=0)
           {
              str=str+n;
              k--;
           }
           return str.length();
    }

    
    public static void main(String[]args)
    {
           String n="123";
           int k=3;
       int ans=  cnt(n,k);

       System.out.println(ans);
    }
    
}
