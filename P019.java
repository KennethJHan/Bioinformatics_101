class P019 {
  public static void main(String[] args) {
    String Seq1 = "ATGTTATAG";
    String RevSeq1 = "";
    for(int i=Seq1.length()-1;i>=0;i--) {
      RevSeq1 += Seq1.charAt(i);
    }
    System.out.println(RevSeq1);
  }
}
