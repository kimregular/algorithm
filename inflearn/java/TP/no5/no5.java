package TP.no5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int n) {
    int answer = 0, sum = 0, lt = 1;
    for (int rt = 1; rt <= (n / 2) + 1; rt++) {
      sum += rt;
      if (sum == n) {
        answer++;
      }
      while (sum > n) {
        sum -= lt++;
        if (sum == n) {
          answer++;
        }
      }
    }
    return answer;
  }
}

public class no5 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("TP/no5/no5.txt"));
    int n = rd.nextInt();
    System.out.println(T.solution(n));
  }
}
