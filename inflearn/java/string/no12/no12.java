package string.no12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public String solution(int n, String str) {
    String answer = "";
    for (int i = 0; i < n; i++) {
      String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
      //   System.out.println(tmp);
      int num = Integer.parseInt(tmp, 2);
      answer += (char) num;
      str = str.substring(7);
    }

    return answer;
  }
}

public class no12 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no12/no12.txt"));
    int n = rd.nextInt();
    rd.nextLine();
    String str = rd.nextLine();
    System.out.println(T.solution(n, str));
  }
}
