import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

class P052 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("049.tsv"));
    String s;
    ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
    while((s=br.readLine())!=null) {
      if(s.startsWith("#")){
        // PASS HEADER
      } else {
        if(s.startsWith("NM_")) {
          //System.out.println(s);
          list.add(new ArrayList<String>(Arrays.asList(s.split("\t"))));
        }
      }
    }
    br.close();
    //System.out.println(list);
    Collections.sort(list, new Comparator<ArrayList<String>>() {
      @Override
      public int compare(ArrayList<String> arg0, ArrayList<String> arg1) {
        double d1 = Double.parseDouble(arg0.get(2));
        double d2 = Double.parseDouble(arg1.get(2));
        //return arg0.get(2).compareTo(arg1.get(2));
        return Double.compare(d1, d2);
      }
    });
    System.out.println(list);
    printResult(list.get(0));
    printResult(list.get(1));
    printResult(list.get(list.size()-1));
    printResult(list.get(list.size()-2));
  }
  
  static void printResult(ArrayList<String> l) {
    System.out.println(l.get(0)+"\t"+l.get(1)+"\t"+l.get(2));
  }
}
