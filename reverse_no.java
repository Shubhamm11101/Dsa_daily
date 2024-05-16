public class reverse_no {
    static int sum = 0;
    static void rev(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n/10);
    }
     
    
  
    
    
      public static void main(String args[]){
       
       
      // System.out.println(palin(121));
      System.out.println(sum);
     // System.out.println(palin(121));
    }
}
