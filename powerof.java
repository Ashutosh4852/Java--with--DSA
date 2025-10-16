import java.util.Scanner;

public class powerof {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int N = sc.nextInt();
    if(N>0 && (N &(N-1))==0){
      System.out.println(N + "Is the power of 2");
    }
    else
    {
      System.out.println(N + "is not the power of 2");
    }
  }
}
