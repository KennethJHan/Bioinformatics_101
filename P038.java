import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class P038 {
  public static void main(String[] args) {
    ArrayList<Double> WT = new ArrayList<Double>(Arrays.asList(58.7, 57.4, 57.9, 57.5, 58.1, 57.3, 58.3, 57.5, 57.8, 58.1));
    ArrayList<Double> Ob = new ArrayList<Double>(Arrays.asList(84.5, 87.2, 85.7, 88.7, 85.4, 85.6, 87.1, 86.9, 88.2, 86.5));

    System.out.println(Collections.max(WT));
    System.out.println(Collections.min(WT));

    System.out.println(Collections.max(Ob));
    System.out.println(Collections.min(Ob));

  }
}
