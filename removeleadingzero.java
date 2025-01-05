public class removeleadingzero {


public static int leadingzero(char ch[])
{
          int k=0;
          for(int i=0;i<ch.length;i++)
          {
            if(ch[i]!='0')
            {
                ch[k++]=ch[i];
            }
          }
          return k;
}





    public static void main(String[]args)
    {
        String str="000012344";
      
        char ch1[]=str.toCharArray();
       int n= leadingzero(ch1);
       for(int i=0;i<n;i++)
       {
        System.out.print(ch1[i]);
       }


    }




    
}
