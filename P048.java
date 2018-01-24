import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class P048 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("result_047.txt", true));
      for(int i=1;i<101;i++) {
        if(i%7 == 0) {
          bw.write(i+" ");
        }
      }
      bw.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
