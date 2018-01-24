import java.util.Arrays;
import java.util.ArrayList;

class P043 {
  public static ArrayList<Integer> Arr;

  public static void main(String[] args) {
    Arr = new ArrayList<Integer>(Arrays.asList(1,1));
    Fibo(10);
    System.out.println(Arr);
    System.out.println(Arr.size());
  }

  static void Fibo(int n) {
    for(int i=0;i<n;i++) {
      Arr.add(Arr.get(Arr.size()-2) + Arr.get(Arr.size()-1));
    }
  }
}
