public class fac {

    // static void fact(int n){
    //     for(int i = 1; i<=n; i++){
    //         if(n % i == 0){
    //             System.out.println(i + " ");
    //         }
    //     }
    // }

    static void fact2(int n){
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.println(i);
                }
                else{
                    System.out.println(i + " " + n/i);
                }
            }
        }
    }
    public static void main(String args[]){
      fact2(20);
    }
}
