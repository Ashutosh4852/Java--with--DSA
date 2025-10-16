import java.util.Scanner;

public class arrayex {

  public static int arrayex(int array[]){
    int largestElement = array[0];
    for(int i=0; i<array.length; i++){
      if(array[i]>largestElement){
        largestElement = array[i];
      }
    }
    return largestElement;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[]  = new int[size];
    System.out.println("Enter the array value one by one");
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    
    int largest = arrayex(arr);
    System.out.println("The largest element is"+largest);
  }
}

