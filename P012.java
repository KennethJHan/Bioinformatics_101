class P012 {

  /*
    Calculate Factorial using while loop
    Kenneth J Han
    2018-01-23
  */

  static int Factorial(int num) {
    int result = 1; // Set result as 1

    // while loop finishes when num > 0
    while(num > 0) {
      result *= num;
      num -= 1; // subtract 1 from num during while loop
    }
    return result;
  }

  public static void main(String[] args) {

    // Run Function and save result to each variable
    int result3 = Factorial(3);
    int result4 = Factorial(4);
    int result5 = Factorial(5);

    // Print Result
    System.out.println(result3+" "+result4+" "+result5);
  }

}
