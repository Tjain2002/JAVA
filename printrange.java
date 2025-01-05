import java.util.*;

public class printrange {

    public static void range(List<int[]> ranges) {
        Set<Integer>unique=new HashSet<>();

    for(int i=0;i<ranges.size();i++)
    {
        int left=ranges.get(i)[0];
        
        int right=ranges.get(i)[1];
        

        for(int j=left;j<=right;j++)
        {
              unique.add(j);
        }



    } 


    
        System.out.println(unique);
    

    }

    public static void main(String[] args) {

        List<int[]> range1 = new ArrayList<>();

        range1.add(new int[] { 2,5 });

        range1.add(new int[] { 6,10});

        range(range1);

    }

}
