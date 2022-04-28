package string.no3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {

  public String solution(String str) {
    String answer = "";
    int m = Integer.MIN_VALUE;
    String[] s = str.split(" ");
    for (String x : s) {
      // improved for loop, the x is comes from s, which consists of Stgings.
      if (x.length() > m) {
        m = x.length();
        answer = x;
      }
    }

    return answer;
  }
}

public class no3 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    BufferedReader rd = new BufferedReader(
      new FileReader("string/no3/no3.txt")
    );
    String str = rd.readLine();
    System.out.println(T.solution(str));
  }
}
