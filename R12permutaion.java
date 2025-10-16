public class R12permutaion {
  public static void printPermutaion(String str, String permutaion){
    if(str.length()==0){
      System.out.println(permutaion);
      return;
    }
    for(int i=0; i<str.length(); i++){
      char currChar = str.charAt(i);
      String newString = str.substring(0, i)+str.substring(i+1);
      printPermutaion(newString, permutaion+currChar);
    }
  }
  public static void main(String[] args) {
    String str = "abc";
    printPermutaion(str, "");
  }
}
