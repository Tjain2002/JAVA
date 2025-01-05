import java.util.*;
public class findfact {
static int fact(int n)
{
    if(n==0)
    {
        return 1;
    }
    else{
        return n*fact(n-1);
    }
}
static  int coutzeros(int n)


{
    int c=0;
        while(n>=5)
        {
c=n/5+c;
n=n/5;
        }
        return c;
}
public static void main(String[]args)
{ 
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
int ans=fact(n);
System.out.println("ans="+ans);
int ans2=coutzeros(n);
System.out.println("numbe rof trailing zeros in factorial="+ans2);

}
    
}
