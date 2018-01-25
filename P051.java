import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class P051 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("049.tsv"));
    String s;
    while((s=br.readLine())!=null) {
      if(s.startsWith("#")){
        // PASS HEADER
      } else {
        if(s.startsWith("NM_")) {
          System.out.println(s);
        }
      }
    }
  }
}
