package string.no8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public String solution(String str) {
    String answer = "NO";
    str = str.toUpperCase().replaceAll("[^A-Z]", "");
    String tmp = new StringBuilder(str).reverse().toString();
    if (str.equals(tmp)) {
      answer = "YES";
    }

    return answer;
  }
}

public class no8 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no8/no8.txt"));
    String str = rd.nextLine();
    System.out.println(T.solution(str));
  }
}
