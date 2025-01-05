public class removevowel1 {



    static void vowel(String str)
    {
        StringBuilder  str1=  new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' &&str.charAt(i)!='O' &&str.charAt(i)!='U' )
            {
               str1.append(str.charAt(i));


            }
        }

        System.out.println(str1);

    }

    public static void main(String[]args)
    {
             String str=" ACADEMY OF TECHNOLOGY ";
             vowel(str);
    }
    
}
