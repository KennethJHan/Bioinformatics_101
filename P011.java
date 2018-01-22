import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class P011 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("011.txt"));
      String s = "The context of Text011";

      bw.write(s);
      bw.newLine();
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
