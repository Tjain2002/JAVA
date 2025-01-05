

import java.util.*;
class Solution1 {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
    List<Integer>ans=new ArrayList<>();
    

    //Set<Integer>set1=new HashSet<>();
    for(int i=0;i<arr1.size();i++)
    {
        int num1=arr1.get(i);
        for(int j=0;j<arr2.size();j++)
        {
            int num2=arr2.get(j);
            
            for(int k=0;k<arr3.size();k++)
            {
                int num3=arr3.get(k);
                
                if(num1==num2&&num2==num3)
                {
                    if(!ans.contains(num1))
                    {
                        ans.add(num1);
                    }
                }
            }
        }
        int max=Integer.MIN_VALUE;
        
    }
    
    
    
    return ans;
                                            
        // Code Here
    }
}