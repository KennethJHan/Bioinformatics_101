import java.util.Arrays;
import java.util.ArrayList;

class P044 {
  //public static ArrayList<String> arr1;
  //public static ArrayList<String> arr2;

  public static void main(String[] args) {
    ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("A","C","G","T"));
    ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("A","C","G","T"));
    ArrayList<String> ret;
    ret = Mer(Integer.parseInt(args[0]), arr1, arr2);
    System.out.println(ret);
  }

  static ArrayList<String> Mer(int n, ArrayList arr1, ArrayList arr2) {
    if(n == 1) {
      return arr2;
    } else {
      ArrayList<String> arr_tmp = new ArrayList<String>();
      for(Object s1: arr1) {
        for(Object s2: arr2) {
          arr_tmp.add(String.valueOf(s1)+String.valueOf(s2));
        }
      }
      arr2 = arr_tmp;
      n--;
      return Mer(n, arr1, arr2);
    }
  }
}
