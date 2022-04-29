package string.no7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  String solution(String str) {
    str = str.toUpperCase();
    String tmp = new StringBuilder(str).reverse().toString();
    if (str.equals(tmp)) {
      return "YES";
    } else {
      return "NO";
    }
  }
}

public class no7 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no7/no7.txt"));
    String str = rd.nextLine();
    System.out.println(T.solution(str));
  }
}
