public class zigzagstring {
    public static void main(String[]args)
    {
        String str="PAY PAL IS HIRING";
       
        int row=3;
        int cnt=0;
         String newstr[]=str.split("\\s+");
         for(int i=0;i<newstr.length;i++)
         {
            String str1=newstr[i];
            for(int j=0;j<str1.length();j++)
            {
                char ch=str1.charAt(j);
                System.out.print(ch+" ");
                cnt++;
                if(cnt==row)
                {
                    System.out.println();
                    cnt=0;
                }
                
                
            }
        

         }
     
        
     
    }
    
}
