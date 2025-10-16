import java.util.Scanner;

public class circle {
  public static double circumferenceOfCircle(int n){
     double c = 2*3.14*n;
     return c;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double result = circumferenceOfCircle(n);
    System.out.println("The circumference of a circle is:" + result);
    sc.close();
  }
}
