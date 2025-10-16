import java.util.Scanner;

public class oddSum {

  public static int oddSum(int n){
    int sum=0;
  for(int i=1; i<=n; i++){
    if(i%2 !=0){
      sum+=i;
    }
  }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = oddSum(n);
    System.out.println("The sum of all odd number " + n + "is:"+result);
    sc.close();
  }
}
