import java.util.*;
public class intersection {


    public static void findintersection(int a[],int b[])
    {
        ArrayList<Integer>arr=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
      //  HashSet<Integer

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                      arr.add(a[i]);
                }
                
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
      //  Integer []arr1=arr.toArray();
        

    }
    public static void main(String[]args)
    {
        int a[] = { 1,2,2,1}, b[] = { 2,2};
        findintersection(a, b);


    }
    
}
