import java.util.Arrays;
import java.util.ArrayList;

class P034_1 {
  public static void main(String[] args) {
    ArrayList<String> MF = new ArrayList<String>(Arrays.asList("M","F","F","M","F","M"));
    System.out.println(MF); // [M, F, F, M, F, M]
    MF.add(1, "M");
    System.out.println(MF); // [M, M, F, F, M, F, M]
  }
}
