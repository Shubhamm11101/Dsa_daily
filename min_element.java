public class min_element {
    static int min(int [] arr){
        
    int ans = arr[0];
    for(int i=0; i<arr.length; i++){
    if(arr[i] < ans){
    ans = arr[i];
    
    }
    }
    return ans;
    }
    public static void main(String args[]){
    int [] arr = {2,3,4,1,12,34,3,5,75,32};
    System.out.println(min(arr));
    }
}
 