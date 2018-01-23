class P013_1 {
  public static void main(String[] args) {
    String Met = "ATG";
    String Trp = "";
    String His = "CAT";

    for(int i=0; i<10; i++) {
      Trp += "TGG";
    }

    String Seq = Met + Trp + His;

    System.out.println(Seq);
  }
}
