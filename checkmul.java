public class checkmul {


public static void main(String[]args)

{


int n=5;
     int arr1[]={2,3,4,1,5};
     //int arr2[]={2,4,5,1,2};
     int option1,option2,max=-1;
     option1=arr1[0]*arr1[1]*arr1[arr1.length-1];
     option2=arr1[arr1.length-1]*arr1[arr1.length-2]* arr1[arr1.length-3];
     
     if(option1>option2)
     {
               max=option1;

     }
     else{
          max=option2;

     }
     System.out.println("maximum="+max);

     







}
    
}
