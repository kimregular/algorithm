package string.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class test {

  public static void main(String[] args) throws IOException {
    BufferedReader rd = new BufferedReader(
      new FileReader("string/test/hello.txt")
    );

    String str;
    while ((str = rd.readLine()) != null) {
      System.out.println(str);
    }

    rd.close();
  }
}
