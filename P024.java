class P024 {
  public static void main(String[] args) {
    String Sentence = "Welcome to Bioinformatics World!";
    int Count = 0;
    for(int i=0; i<Sentence.length(); i++) {
      if(Sentence.charAt(i) == ' ') {
        Count++;
      }
    }
    System.out.println(Count+1);
  }
}
