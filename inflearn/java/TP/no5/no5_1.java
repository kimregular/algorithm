package TP.no5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int n) {
    int answer = 0, cnt = 1;
    n--;
    while (n > 0) {
      cnt++;
      n -= cnt;
      if (n % cnt == 0) answer++;
    }

    return answer;
  }
}

public class no5_1 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("TP/no5/no5.txt"));
    int n = rd.nextInt();
    System.out.println(T.solution(n));
  }
}
