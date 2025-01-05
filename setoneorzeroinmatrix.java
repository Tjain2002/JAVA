public class setoneorzeroinmatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 0 },
                { 0, 0 } };
        int n = matrix.length;
        int r[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = 0;
            for (int j = 0; j < n; j++) {
                c[j] = 0;

            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==1)
                {
                    r[i]=1;
                    c[j]=1;

                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(r[i]==1||c[i]==1)
                {
                    matrix[i][j]=1;
                }
            }
        }
        

    }

}
