class P007 {

  static int Factorial(int num) {
    int result = 1;
    while(num > 0) {
      result *= num;
      num -= 1;
    }
    return result;
  }

  public static void main(String[] args) {
    int result3 = Factorial(3);
    int result4 = Factorial(4);
    int result5 = Factorial(5);

    System.out.println(result3+" "+result4+" "+result5);
  }

}
