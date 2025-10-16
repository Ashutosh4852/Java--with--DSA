
public class patterns9 {
  public static void main(String[] args) {
    // for(int i =0; i<4; i++){
    //   for(int j=0; j<5; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();


                // Que 2

  //      int N = 4;
  //      int M = 5;
  //      for(int i=1; i<=N; i++){
  //       for(int j=1; j<=M; j++){
  //         if(i==1 || j==1 || i==N || j==M){
  //           System.out.print("*");
  //         }
  //         else
  //         {
  //           System.out.print(" ");
  //         }
  //       }
  //       System.out.println();
  //      }         


          //  half rectangle // Que3

      //       int m= 4;
      // for(int i = 1; i<=m; i++){
      //   for(int j =1; j<=i; j++){
      //     System.out.print("*");
      //   }
      //   System.out.println();
      // } 



           
          //  inverted half rectangle

       int m = 4;
       for(int i=m; i>=1; i--){
        for(int j =1; j<=i; j++){
          System.out.print("*");
        }
        System.out.println();
       }

  }
}



