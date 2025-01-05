public class findrectangleinmatrix {

    public static void matrix(int arr[][]) {
        int row[] = new int[arr.length];
        int col[] = new int[arr[0].length];
        int n = 0, m = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 1) {
                    i = i + 1;
                } else {
                    arr[m++][n++] = arr[i][j];
                }
            }
          //  System.out.println();
        }
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        System.out.print(arr[i][j]);

    }
    System.out.println();
}


    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 },
        };

        matrix(arr);
    }

}
