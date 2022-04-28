package string.no4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {

  public ArrayList<String> solution(String[] str) {
    ArrayList<String> answer = new ArrayList<>();
    for (String x : str) {
      char[] s = x.toCharArray();
      int lt = 0, rt = x.length() - 1;
      while (rt < lt) {
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }
      String tmp = String.valueOf(s);
      answer.add(tmp);
    }
    return answer;
  }
}

public class no4_1 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no4/no4.txt"));
    int n = rd.nextInt();
    rd.nextLine();
    String[] str = new String[n];
    for (int i = 0; i < n; i++) {
      str[i] = rd.nextLine();
    }
    for (String x : T.solution(str)) {
      System.out.println(x);
    }
  }
}
