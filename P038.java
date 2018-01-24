class P038 {
  public static void main(String[] args) {
    double[] WT = {58.7, 57.4, 57.9, 57.5, 58.1, 57.3, 58.3, 57.5, 57.8, 58.1};
    double[] Ob = {84.5, 87.2, 85.7, 88.7, 85.4, 85.6, 87.1, 86.9, 88.2, 86.5};

    double WT_sum = 0;
    double Ob_sum = 0;

    for(Double d : WT) {
      WT_sum += d;
    }
    for(Double d : Ob) {
      Ob_sum += d;
    }

    System.out.println("Type,Sum,Average");
    System.out.println("WT,"+WT_sum+","+WT_sum/WT.length);
    System.out.println("Ob,"+Ob_sum+","+Ob_sum/Ob.length);
  }
}
