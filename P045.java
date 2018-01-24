import java.util.Arrays;
import java.util.ArrayList;

class P045 {

  public static void main(String[] args) {
    ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("A","C","G","T"));
    ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("A","C","G","T"));
    ArrayList<String> ret;
    ArrayList<String> ret2 = new ArrayList<String>();

    ret = Mer(7, arr1, arr2);

    for(Object o: ret) {
      String s = String.valueOf(o);
      if(isPalindrome(s)) {
        ret2.add(s);
      }
    }

    System.out.println(ret2);
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

  static boolean isPalindrome(String s) {
    int l = 0;
    int h = s.length()-1;

    while(h > l) {
      if(s.charAt(l++) != s.charAt(h--)) {
        return false;
      }
    }
    return true;
  }

}
