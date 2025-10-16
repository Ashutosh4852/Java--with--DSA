import java.util.*;
public class function {

  public static int multiplyNumber(int a , int b){
      int multiplied = a*b;
      return multiplied;
  }
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int multiplied = multiplyNumber(a, b);
  System.out.println("The multiplication of two number is" + multiplied);
}
}
