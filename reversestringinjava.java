public class reversestringinjava {



    public static void reverse(String str)
    {
char ch[]=str.toCharArray();
int s=0;
int e=ch.length-1;

while(s<e)
{

    char temp=ch[s];
    ch[s]=ch[e];
    ch[e]=temp;
    s++;
    e--;
}
System.out.println(ch);


// System.out.println(str1);
    }
    public static void main(String[]args)
    {
        String str="tanisha jain";
      reverse(str);
        // System.out.println(str1);
           
    }


    
}
