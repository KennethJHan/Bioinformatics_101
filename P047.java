import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class P047 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("result_047.txt"));
      for(int i=1;i<101;i++) {
        if(i%3 == 0) {
          bw.write(i+" ");
        }
      }
      bw.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
