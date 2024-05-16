public class patterns {

   static void patter01(int n){
    //row
    for(int i=1; i<=n; i++){
    //column
    for(int j=1; j<=i; j++){
    System.out.print("* ");
    }
    System.out.println();
    }
}

    static void patter02(int n){
    //row
    for(int i=1; i<=n; i++){
    //column
    for(int j=1; j<=n; j++){
    System.out.print("* ");
    }
    System.out.println();
    }
    }

    static void patter03(int n){
    //row
    for(int i=1; i<=n; i++){
    //column
    for(int j=1; j<=n-i+1; j++){
    System.out.print("* ");
    }
    System.out.println();
 }
}

static void patter04(int n){
    //row
    for(int i=1; i<=n; i++){
    //column
    for(int j=1; j<=i; j++){
    System.out.print(j);
    }
    System.out.println();
 }
}

static void patter05(int n){
    //row
    for(int i=1; i<=2*n; i++){
    //column
    int totalCols = i > n ? 2* n - i: i;
    for(int j=1; j<totalCols; j++){
    System.out.print("* ");
    }
    System.out.println();
 }
}

static void patter06(int n){
    //row
    for(int i=1; i<=2*n; i++){
    //column
    int totalCols = i > n ? 2* n - i: i;
    int noOfSpaces = n - totalCols;
    for(int s = 0; s<=noOfSpaces; s++){
        System.out.print(" ");
    }
    for(int j=0; j<totalCols; j++){
    System.out.print("* ");
    }
    System.out.println();
 }
}

static void patter07(int n){
   
    
    //row
    for(int i=1; i<=n; i++){
      //spaces
        for(int s = 0; s<=n-i; s++){
            System.out.print(" ");
        }
    //column
    for(int j=i; j>=1; j--){
    System.out.print(j);
    }
    for(int j = 2; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
 }
}


    
    public static void main(String args[]){
    patter07(4);
     
   } 

}

