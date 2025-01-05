import java.util.*;

public class finddisticntele {
    public static void distinct(int arr1[],int arr2[])



    {
        ArrayList<Integer>ans =new ArrayList<>();
                     HashSet<Integer>set1=new HashSet<>() ;
                                
                    //  HashSet<Integer>set2=new HashSet<>();

                    for(int i=0;i<arr1.length;i++)
                    {
                        set1.add(arr1[i]);
                    }
                    for(int i=0;i<arr2.length;i++)
                    {
                        set1.add(arr2[i]);
                    }

        for(int num:set1)
        {
            System.out.println(num);
        }

    }
    public static void main(String[]args)
    {
              int arr1[]={2,4,5,1,7,8};
              int arr2[]={1,5,6,9,1,2};
              distinct(arr1, arr2);
    }
}
