import java.util.Arrays;

class P033 {
  public static void main(String[] args) {
    double[] WT = {58.7, 57.4, 57.9, 57.5, 58.1, 57.3, 58.3, 57.5, 57.8, 58.1};
    double[] Ob = {84.5, 87.2, 85.7, 88.7, 85.4, 85.6, 87.1, 86.9, 88.2, 86.5};

    double[] WT_1 = Arrays.copyOfRange(WT, 1, 4);
    double[] Ob_1 = Arrays.copyOfRange(Ob, 1, 4);

    System.out.println(Arrays.toString(WT_1));
    System.out.println(Arrays.toString(Ob_1));
  }
}
