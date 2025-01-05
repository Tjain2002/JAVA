public class duplicatezero {

    public static void duplicateZeros(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];

                   // System.out.println(arr[j]);
                }

                i++;
            }

        }
    }
    




    public static void main(String[] args) {

        int arr[]={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);

       /*  for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        String str;
        String s="tjbui";

        str=s.toLowerCase();

        //str.toLowerCase();
        
        
    }
}
