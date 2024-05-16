public class binary_search_recursion {

    static int binarySearch(int arr[], int target, int s, int e){
        if(s>e){
            return -1;
        }

      int m = s + (e - s)/2;
      if(arr[m] == target){
        return m;
      }

      if(target<arr[m]){
        return binarySearch(arr, target, s, e - 1);
      }
      else{
        return binarySearch(arr, target, s+1, e);
      }
    }
   public static void main(String aegs[]){
    int arr[] = {1,2,4,5,66,77};
    int target = 66;
    int ans = binarySearch(arr, 66, 0, arr.length-1);
    System.out.println(ans);
   } 
}
