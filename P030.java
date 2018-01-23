class P030 {
  public static void main(String[] args) {
    String Seq1 = "11A2TG3TT000AT1A2G";
    for(int i=0;i<Seq1.length();i++) {
      if (Character.isLetter(Seq1.charAt(i))) {
        System.out.print(Seq1.charAt(i));
      }
    }
    System.out.println("");
  }
}
