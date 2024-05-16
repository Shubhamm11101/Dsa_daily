public class binary_search {
static int binarySearch(int arr[], int target){
int start = 0;
int end = arr.length-1;

        while(start<=end){
            //find middle element
            // int mid = (start + end)/2 could exceeds integer values in java so we use start+(start-end)/2
            int mid = start +(end - start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
          int arr[] ={-55,-44,-12,1,24,57,65,78,80,86,90,102};
          int target = -55;
          int ans = binarySearch(arr, target);
          System.out.println(ans);
    }
}
