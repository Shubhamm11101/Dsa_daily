import java.util.ArrayList;

public class rec_linear {
    static boolean find(int arr[], int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    
    static ArrayList<Integet> findIndex(int arr[], int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }

   
    final ArrayList<Integet> findAllIndex(int[] arr, int target, int index, ArrayList<Integet> list) {
       
       
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.addAll(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
    }


    public static void main(String args[]){
   int arr[] = {1,2,3,5,67,2};
   System.out.println(find(arr, 5, 0));
   System.out.println(findIndex(arr,3,0));
   System.out.println(findAllIndex(arr,4,index+1,new ArrayList<>()));
    }
}
