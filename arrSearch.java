import java.util.Scanner;

public class arrSearch {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int number[] = new int[size];

   for(int i=0; i<size; i++){
    number[i] = sc.nextInt();
   }
   
    int X = sc.nextInt();

    for(int i=0; i<number.length; i++){
      if(number[i]==X){
        System.out.println("Item is found at index:" + i);
      }
    }
  }
}
