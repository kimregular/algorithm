package string.no6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public String solution(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.indexOf(str.charAt(i)) == i) {
        answer += str.charAt(i);
      }
    }
    return answer;
  }
}

public class no6 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no6/no6.txt"));
    String str = rd.nextLine();
    System.out.println(T.solution(str));
  }
}
