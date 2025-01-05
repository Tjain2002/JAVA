public class countmaximum1s {

    static void matrix(int arr[][]) {
        int c, max = -1,row=0;
        
        for (int i = 0; i < 3; i++) {
            c=0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 1) {
                    c++;
                }
            }
            if (c > max) {
                max = c;
                row=i;
            }

        }
        System.out.println("number in "+row  +"number of 1s in matrix"+max );
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 1 }, { 0, 1, 1 }, { 1, 1, 1 } };
        matrix(arr);

    }

}
