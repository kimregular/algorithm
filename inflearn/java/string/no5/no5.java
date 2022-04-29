package string.no5;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public String solution(String str) {
    String answer;
    char[] s = str.toCharArray();
    int lt = 0, rt = s.length - 1;
    while (lt < rt) {
      if (!Character.isAlphabetic(s[lt])) {
        lt++;
      } else if (!Character.isAlphabetic(s[rt])) {
        rt--;
      } else {
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }
    }
    answer = String.valueOf(s);
    return answer;
  }
}

public class no5 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no5/no5.txt"));
    String str = rd.nextLine();
    System.out.println(T.solution(str));
  }
}
