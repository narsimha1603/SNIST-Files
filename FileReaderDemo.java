import java.io.*;

class FileReaderDemo {
  public static void main(String args[]) throws IOException {
    FileReader fr = new FileReader("Datai.java");
 BufferedReader br = new BufferedReader(fr);
    String s;

    while((s = br.readLine()) != null) {
      System.out.println(s);
    }

    fr.close();
  }
}
