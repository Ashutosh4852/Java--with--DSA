public class R10subseq {
  public static void printSubseq(String str , int idx, String newString){
    if(idx==str.length()){
      System.out.println(newString);
      return;
    }
    char currchar = str.charAt(idx);
    printSubseq(str, idx+1, newString+currchar);
   printSubseq(str, idx+1, newString);
  }
  public static void main(String[] args) {
    String str = "abc";
    printSubseq(str, 0, "");
  }
}
