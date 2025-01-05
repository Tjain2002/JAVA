public class findthesumofgivencoordinates {
    public static void sum(int mat[][],int l1 ,int r1,int l2, int r2)
    {
         int sum=0;
         for(int i=l1;i<=l2;i++)
         {
            for(int j=r1;j<=r2;j++)
            {
                sum=mat[i][j]+sum;
            }
            //System.out.println("");
         }   
         System.out.println(sum);
              
    }


    public static void main(String[]args)
    {
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24}};

        int l1=1;
        int l2=3;
        int r1=1;
        int r2=3;
        sum(mat,l1,r1,l2,r2);


    }
    
}
