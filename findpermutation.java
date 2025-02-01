import java.util.*;


public class findpermutation {


            static void perm(int num[],List<List<Integer>>ans , boolean freq[],List<Integer>inter )
            {
                          if(num.length==inter.size())
                          {


                            ans.add(new ArrayList<>(inter));
                            return;
                          } 
                          
                          
                          for(int i=0;i<num.length;i++)
                          {
                            if(!freq[i])
                            {
                                freq[i]=true;
                                inter.add(num[i]);
                                perm(num,ans,freq,inter);
                                inter.remove(inter.size()-1);
                                freq[i]=false;
                               

                            }
                          }
            }







    public static List<List<Integer>>finalans(int num[])

    {




              
    boolean fre[]=new boolean[num.length];
    List<List<Integer>>ans=new ArrayList<>();
    List<Integer>inter=new ArrayList<>();
    perm(num,ans,fre,inter);
    return ans;



        

    }

    public static void main(String[]args)
    {


int arr[]={1,2,3};
List<List<Integer>>ans=finalans(arr);
System.out.println(ans);



    }
    
}
