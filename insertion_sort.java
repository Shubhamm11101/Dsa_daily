import java.util.*;

public class insertion_sort {
  static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void insertion(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);

                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String args[]){
   int arr[] ={5,2,46,2,1,8,9};
   insertion(arr);
   System.out.println(Arrays.toString(arr));
    }
}
