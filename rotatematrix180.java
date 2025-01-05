public class rotatematrix180 {


    public static void rotate(int mat[][])
    {
                int n=mat.length;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n/2;j++)
                    {
                        int temp=mat[i][j];
                        mat[i][j]=mat[i][n-j-1];
                        mat[i][n-j-1]=temp;
                    }
                }
                for(int i=0;i<n/2;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        int temp=mat[i][j];
                        mat[i][j]=mat[n-i-1][j];
                        mat[n-i-1][j]=temp;
                    }
                }

                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(mat[i][j]);
                    }
                    System.out.println();
                }


    }

    public static void main(String[]args)
    {
int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
rotate(mat);
    }
    
}
