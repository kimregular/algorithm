package string.no7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public String solution(String str) {
    String answer = "YES";
    str = str.toUpperCase();
    int len = str.length();
    for (int i = 0; i < len / 2; i++) {
      if (str.charAt(i) != str.charAt(len - i - 1)) {
        return "NO";
      }
    }
    return answer;
  }
}

public class no7_1 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no7/no7.txt"));
    String str = rd.nextLine();
    System.out.println(T.solution(str));
  }
}
