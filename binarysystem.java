public class binarysystem {

   static int ans(String str)
    {


              int a= str.charAt(0)-'0';
              int num=0;
              for(int i=1;i<str.length();i++)
              {

                  char ch=str.charAt(i);
                  if(ch=='A')
                  {
                     a= a& str.charAt(i+1)-'0';          
                  }

                  else if(ch=='B')
                  {
                    a=a|str.charAt(i+1)-'0';
                  }
                  else if(ch=='C')
                  {
                       a=a^str.charAt(i+1)-'0';
                  }
              }

            
            
            // char ch=str.charAt(i);
              

        
return a;
    }

    public static void main(String[]arg)
    {  

String str="C0C1C1A0B1";
int n=ans(str);
System.out.println(n);

    }
    
}
