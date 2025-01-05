
import java.util.*;

public class selectionsort1 {

    static void selection(int arr[]) {
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    public static void main(String[]args) {

        selectionsort1 s = new selectionsort1();

     //   int size = 5;
        // Scanner sc= new Scanner(System.in);
        int arr[] = { 2, 3, 1, 5, 8 };
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
