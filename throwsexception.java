public class throwsexception {

    public static void exceptionblock() throws ArithmeticException {
        System.out.println("here is excetion occur");
        throw new ArithmeticException();
    }

    public static void main(String[]args)
    {
                   int a=3,b=0;
                   int c; 
                   try{



                    //  c=a/b;
                   
                     exceptionblock();

                    //  System.out.println(c);

                   }
                   
                   


                   catch(ArithmeticException e)
                   {
                             System.out.println(e);
                   }
                   catch(ArrayIndexOutOfBoundsException a1)

                   { 
                    System.out.println(a1);

                   }
    }



}
