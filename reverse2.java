import java.util.Scanner;

public class reverse2 {

  public static void Reverse2(int array[]){
    for(int i=0; i<array.length/2; i++){
        int temp =array[i];
        array[i] = array[array.length-1-i];
        array[array.length-1-i] = temp;
    }
  }
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int arr[] = new int[size];
   System.out.println("Enter the value of array on by one");
   for(int i=0; i<arr.length; i++){
    arr[i] = sc.nextInt();
   }
   Reverse2(arr);
   for(int value: arr){
    System.out.print(value + " \t ");
   }
 }
}
