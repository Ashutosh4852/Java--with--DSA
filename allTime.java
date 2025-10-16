import java.util.Scanner;

public class allTime {
  public static void main(String[] args) {
    int positive = 0 , negative = 0 , Zero =0;
    System.out.println("Press 1 to continue & Press 0 to end:");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    while(input==1)
    {
      System.out.println("Enyer your number:");
      int number = sc.nextInt();
      if(number>0)
      {
        positive++;
      }
      else if(number<0)
      {
        negative++;
      }
      else{
        Zero++;
      }
    
      

      System.out.println("Press 1 to continue & 0 to stop");
      input = sc.nextInt();
    }
    System.out.println("Positives : "+ positive);
    System.out.println("Negatives : "+ negative);
    System.out.println("Zeros : "+ Zero);
  }
}
