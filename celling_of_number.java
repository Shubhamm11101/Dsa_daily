public class celling_of_number {
    static int cellingOfNumber(int arr[], int target){
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
        return start;
    }
    public static void main(String args[]){
      int arr[] = {1,2,3,6,10,14,16,18};
      int target = 15;
      int ans = cellingOfNumber(arr, target);
      System.out.println(ans);
    }
}
