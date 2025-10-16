import java.util.Scanner;

public class greaterTwo {

  public static void greaterOfTwo(int n , int m){
    if(n>m){
      System.out.println(n+ "is Greater:");
    }
    else
    {
      System.out.println(m+"is Greater:");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    greaterOfTwo(n, m);
  }
}
