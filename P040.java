import java.util.Arrays;
import java.util.ArrayList;

class P040 {
  public static void main(String[] args) {
    String s = "WT,578.6,57.86,Ob,865.8,86.58";
    ArrayList<String> result = new ArrayList<String>(Arrays.asList(s.split(",")));
    System.out.println(s);  // WT,578.6,57.86,Ob,865.8,86.58
    System.out.println(result);  // [WT, 578.6, 57.86, Ob, 865.8, 86.58]
  }
}
