public class rowwisesum {
    public static void main(String[] args) {
        int arr[][] = { { 2, 4, 5 }, { 4, 7, 8 }, { 6, 7, 8 } };
        int sum1, sum2 = 0, sum3 = 0;

        System.out.println("row wise sum");
        for (int i = 0; i < 3; i++) {

            sum1 = 0;
            for (int j = 0; j < 3; j++) {
                sum1 = arr[i][j] + sum1;

            }

            System.out.println(sum1);
        }

        System.out.println("column wise sum");
        for (int i = 0; i < 3; i++) {
            sum2 = 0;
            for (int j = 0; j < 3; j++) {
                sum2 = arr[j][i] + sum2;
            }

            System.out.println(sum2);
        }
        System.out.println("diagonal sum");
        for (int i = 0; i < 3; i++) {
            sum3 = 0;
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum3 = sum3 + arr[i][j];
                }
            }

            System.out.println(sum3);
        }

    }

}
