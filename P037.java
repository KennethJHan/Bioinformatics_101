import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class P037 {
  public static void main(String[] args) {
    ArrayList<String> MF = new ArrayList<String>(Arrays.asList("M","F","F","M","F","M"));
    System.out.println(MF); // [M, F, F, M, F, M]
    Collections.reverse(MF);
    System.out.println(MF); // [M, F, M, F, F, M]
  }
}
