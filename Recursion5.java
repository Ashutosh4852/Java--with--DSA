public class Recursion5 {
  public static int printPower(int x , int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int calun = printPower(x, n-1);
    int totalPower = x*calun;
    return totalPower;
  }
  public static void main(String[] args) {
    int x=2 , n=5;
    int realPower = printPower(x, n);
    System.out.println(realPower);
  }
}
