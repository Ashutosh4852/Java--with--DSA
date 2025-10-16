import java.util.Scanner;

public class power {

  public static double numberPower(double a , double b){
    return Math.pow(a, b);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a base");
    double a = sc.nextDouble();
    System.out.println("Enter a exponent");
    double b = sc.nextDouble();
    double result = numberPower(a, b);
    System.out.println(a+"raise to the power of" + b + "is:" + result);
  }
}
