import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class P010 {
  public static void main(String[] args) {
    BufferedReader br = null;
    FileReader fr = null;

    try {
      fr = new FileReader("010.txt");
      br = new BufferedReader(fr);

      String s;

      while( (s=br.readLine()) != null ) {
        System.out.println(s);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
        fr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
