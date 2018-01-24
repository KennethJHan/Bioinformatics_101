class P042 {
  public static void main(String[] args) {
    int n = 5;
    int ret = Factorial(n);
    System.out.println(ret);
  }

  static int Factorial(int n) {
    if(n == 0) {
      return 1;
    } else {
      return n * Factorial(n-1);
    }
  }
}
