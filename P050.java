import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class P050 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("049.csv"));
      String s;
      String header = "";
      String content = "";
      int i=0;
      while((s=br.readLine())!=null) {
        if(i==0) {
          i++;
        } else {
          String[] arr = s.split(",");
          header += arr[0]+"\t";
          content += arr[1]+"\t";
        }
      }
      System.out.println(header);
      System.out.println(content);
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
