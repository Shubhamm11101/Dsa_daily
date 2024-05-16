import java.util.Arrays;

public class sorting {

    static void bubble(int []arr){
     for(int i=0; i<arr.length; i++){
        for(int j=1; j<arr.length-1; j++){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
     }
    }
    public static void main(String args[]){
        int []arr = {5,6,4,7,2,7};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
    } 
}
