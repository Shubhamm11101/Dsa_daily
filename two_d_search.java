import java.util.Arrays;

public class two_d_search {
    static int[]search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int []{i, j};
                }
            }
       
        }
        return new int []{-1,-1};

    }
    public static void main(String args[]){
      int [][] arr = {
        {45,64,21},
        {67,87,90,21,34},
        {43,57}
      };
      int target = 1;
      int ans[] = search(arr, target);
      System.out.println(Arrays.toString(ans));
    }
}
