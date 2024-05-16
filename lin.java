public class lin{
    static int linearSearch(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,34,5,6,72,57,11,4,69,54,4,73,12};
        int target = 14;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
}
