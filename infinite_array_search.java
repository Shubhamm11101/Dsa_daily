public class infinite_array_search {
    static int binarySearch(int arr[], int target, int start, int end){
        
        while(start<=end){
            int mid = start + (end - start)/2;

            if(target<arr[mid]){
               end = mid - 1;
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

    static int ans(int arr[], int target){
        //first find range
        // first find with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int temp = end + 1;
            //double the box value
            // end = previous end + size of box * 2
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);


    }
    public static void main(String args[]){
       int arr[] = {1,3,5,6,7,12,13,15,34,45,56,57,59,67,89,90,99};
       int target = 67;
    System.out.println(ans(arr, target));
    }
}
