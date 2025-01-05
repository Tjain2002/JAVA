import java.util.*;
public class rotatearray {


public static  void rotate(int arr[],int d,int n)
{
int k=0;

int temp[]=new int[n];
for(int i=d;i<n;i++)
{
    temp[k]=arr[i];
    k++;
}
for(int i=0;i<d;i++)
{
    temp[k]=arr[i];
    k++;
}
for(int i=0;i<=n;i++)
{
    arr[i]=temp[i];
}



printarray(arr, n);

}
public static void printarray(int arr[],int n)
{

for(int i=0;i<n;i++)
{
    System.out.println(arr[i]);
}
}
public static void main(String[]args)
{
   Scanner sc= new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int [n];
   int d=3;
   System.out.println("enter the array element");
   for(int i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   rotate(arr, d+1, n) ;
  // printarray(arr, n);

}
    
}
