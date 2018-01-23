class P019_1 {
  public static void main(String[] args) {
    String Seq1 = "ATGTTATAG";
    String RevSeq1 = "";
    String CompSeq1 = "";

    for(int i=Seq1.length()-1;i>=0;i--) {
      RevSeq1 += Seq1.charAt(i);
      if(Seq1.charAt(i) == 'A') {
        CompSeq1 += "T";
      } else if(Seq1.charAt(i) == 'C') {
        CompSeq1 += "G";
      } else if(Seq1.charAt(i) == 'G') {
        CompSeq1 += "C";
      } else if(Seq1.charAt(i) == 'T') {
        CompSeq1 += "A";
      }
    }

    System.out.println(Seq1);
    System.out.println(RevSeq1);
    System.out.println(CompSeq1);

  }
}
