public class zprint {

// public static void printz(int n)

public static void main(String[]args)
{

    int n=5;
    for(int i=0;i<5;i++)
    {

    for(int j=0;j<5;j++)
    {
        if(j==i-1||i==0||i==n-1) // here is reverse Z pattern
        {
            System.out.print("*");
        }
        // if(j==n-i-1||i==0||i==n-1) // here is Z pattern
        // {
        //     System.out.print("*");
        // }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
    

    }

    
}


    
}
