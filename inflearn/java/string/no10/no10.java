package string.no10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int[] solution(String str, char s) {
    int[] answer = new int[str.length()];
    int p = 1000;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == s) {
        p = 0;
        answer[i] = p;
      } else {
        p++;
        answer[i] = p;
      }
    }
    p = 1000;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) == s) {
        p = 0;
      } else {
        p++;
        answer[i] = Math.min(answer[i], p);
      }
    }

    return answer;
  }
}

public class no10 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no10/no10.txt"));
    String[] fi = new String[2];
    fi = rd.nextLine().split(" ");
    String str = fi[0];
    String s1 = fi[1];
    char s = s1.charAt(0);
    for (int x : T.solution(str, s)) {
      System.out.print(x + " ");
    }
  }
}
