class P006 {
  public static void main(String[] args) {
    int num = 5;
    int result = 1;

    while(num > 0) {
      result *= num;
      num -= 1;
    }

    System.out.println(result);
  }
}
