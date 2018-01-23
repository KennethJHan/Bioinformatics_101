class P021 {
  public static void main(String[] args) {
    String Seq1 = "AGTTTATAG";
    
    for(int i=0;i<Seq1.length()-2+1;i++) {
      if(Seq1.substring(i,i+2).equals("TT")) {
        System.out.println(i);
      }
    }
    
  }
}
