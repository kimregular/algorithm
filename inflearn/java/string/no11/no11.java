package string.no11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public String solution(String str) {
    str += " ";
    String answer = "";
    int cnt = 1;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        cnt++;
      } else {
        answer += str.charAt(i);
        if (cnt > 1) {
          answer += String.valueOf(cnt);
        }
        cnt = 1;
      }
    }

    return answer;
  }
}

public class no11 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no11/no11.txt"));
    String str = rd.nextLine();
    System.out.println(T.solution(str));
  }
}
