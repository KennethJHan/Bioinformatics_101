class P022 {

  static int counter(String s, char c) {
    int cnt = 0;
    for(int i=0;i<s.length();i++) {
      if(s.charAt(i) == c) {
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    String Seq1 = "AGTTTATAG";
    System.out.println(counter(Seq1, 'T'));
  }

}
