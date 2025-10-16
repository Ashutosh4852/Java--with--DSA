import java.util.Scanner;

public class average {

  public static float numberaverage(int a , int b , int c){
    float z = (a+b+c)/3f;
    return z;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
   float avg = numberaverage(a, b, c);
   System.out.println(avg);
  }
}
