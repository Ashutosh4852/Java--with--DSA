import java.util.Scanner;

public class array2D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int colum = sc.nextInt();
    int [][]numbers = new int[row][colum];


    for(int i=0; i<row; i++){
      for(int j=0; j<colum; j++){
        numbers[i][j]  =  sc.nextInt();
      }
    }
    for(int i=0; i<row; i++){
      for(int j=0; j<colum; j++){
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
   
  }
}
