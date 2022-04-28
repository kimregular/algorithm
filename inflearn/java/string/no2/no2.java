package string.no2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {

  public String solution(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        answer += Character.toLowerCase(str.charAt(i));
      } else {
        answer += Character.toUpperCase(str.charAt(i));
      }
    }
    return answer;
  }

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    BufferedReader rd = new BufferedReader(
      new FileReader("string/no2/no2.txt")
    );
    String str = rd.readLine();
    System.out.println(T.solution(str));
  }
}
