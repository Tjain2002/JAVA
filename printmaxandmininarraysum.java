public class printmaxandmininarraysum {

    public static void minmax(int arr[])

    {
        int sum;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum = arr[j] + sum;

                }
            }

            if (sum > max) {
                max = sum;
            }

            else if (sum < min) {
                min = sum;
            }

        }

        System.out.println(min);
        System.out.println(max);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        minmax(arr);

    }

}
