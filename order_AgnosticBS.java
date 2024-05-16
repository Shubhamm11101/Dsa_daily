public class order_AgnosticBS{
    static int orderAgnosticBS(int arr[], int target){
        int start = 0; 
        int end = arr.length - 1;
         
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
      // int arr[] = {-10,-8,-5,5,23,45,67,69,70,89,90};
      int arr[] = {99,87,76,67,56,44,32,21,-2,-33,-44,-65,-77};
       int target = -2;
       int ans = orderAgnosticBS(arr, target);
       System.out.println(ans);
    }
}