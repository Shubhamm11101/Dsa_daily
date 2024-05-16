public class even_digits {
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
       if(numberOfDigits % 2 == 0){
        return true;
       }
       return false;
    }

    static int digits(int num){
        int count =0;
        while(num>0){
         num = num/10;
         count++;
        }

        return count;

    }
    public static void main(String args[]){
        int nums[] = {12,353,5357,134,61,145,674};
        System.out.println(findNumbers(nums));
    }
}
