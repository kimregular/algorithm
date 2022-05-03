package string.no9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(String s) {
    int answer = 0;
    for (char x : s.toCharArray()) {
      if (x >= 48 && x <= 57) {
        answer = answer * 10 + (x - 48);
      }
    }
    return answer;
  }
}

public class no9 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no9/no9.txt"));
    String s = rd.nextLine();
    System.out.println(T.solution(s));
  }
}
