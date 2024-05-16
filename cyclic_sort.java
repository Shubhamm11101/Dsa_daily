import java.util.*;

public class cyclic_sort {
    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cyclic(int []arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    public static void main(String args[]){
       int arr[] = {6,5,4,2,3,1};
       cyclic(arr);
       System.out.println(Arrays.toString(arr));
    }
}
