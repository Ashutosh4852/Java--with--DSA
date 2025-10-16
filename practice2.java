import java.util.Scanner;
public class practice2 {

  public static void evenProgam(int n){
    if(n%2==0)
    {
      System.out.println("It is a even");
    }
    else
    {
      System.out.println("It is not even");
    }
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     evenProgam(n);
     sc.close();
  }
}
