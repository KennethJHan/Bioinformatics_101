class P018_1 {
  public static void main(String[] args) {
    String Seq1 = "AGTTTATAG";
    for(int i=0;i<Seq1.length();i+=3){
      System.out.println(Seq1.substring(i,i+3));
    }
  }
}
