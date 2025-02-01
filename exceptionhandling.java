public class exceptionhandling {

    public static void main(String[]args)
    {
        int a=5,b=2;
        int c;
        try{

                c= a/b;
                if(b==0)
                {
                    throw new ArithmeticException("here is arithmetic exception");
                }
                else{
                    System.out.println("c= "+c);
                }
                

            

        }
        catch(ArithmeticException e)
        {
            System.out.println("exception error"+e);
        }

       
    }
    
}
