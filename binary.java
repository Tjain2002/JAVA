 class find {
 boolean binary1(int arr[],int s,int e,int target)
    {
        int mid=(s+e)/2;
        while(s<e)

    {

        if (arr[mid] == target)
         {
            return true;
         }   
         else if (target > arr[mid]) {
            s = mid + 1;
         }
         else {
            e = mid - 1;
        }
        mid = (s + e) / 2;
    }
    return false;
}
}
public class binary {
    public static void main(String[] args) {

        int arr[]={2,3,6,8,10};
        int s=0,e=arr.length;
        int target=10;

        find f = new find();
       boolean ans= f.binary1(arr, s, e, target);
       if(ans)
       {
        System.out.println("target is found");
       }
       else{
        System.out.println("target is not found");
       }

    }

}
