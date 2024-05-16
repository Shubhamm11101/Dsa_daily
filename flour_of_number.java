public class flour_of_number {
    static int flourOfNumber(int arr[], int target){
    int start = 0;
    int end = arr.length-1;

    while(start<=end){
        int mid = start + (end - start)/2;

        if(target>arr[arr.length-1]){
            return -1;
        }

        if(target<arr[mid]){
          end = mid - 1;
        }
        else{
            start = mid + 1;
        }
    }
    return end;
}
    public static void main(String args[]){
       int arr[] = {1,2,3,43,45,61,67,89,90,98};
       int target = 4;
       int ans = flourOfNumber(arr, target);
       System.out.println(ans);
    }
}
