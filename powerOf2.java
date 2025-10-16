import java.util.Scanner;

public class powerOf2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the correct valid number:");
    long N = sc.nextLong();
    if(N>0 && (N&(N-1))==0){
      System.out.println("This is the power of 2!");
    }
    else
    {
      System.out.println("This is not the power of 2");
    }
  }
}
