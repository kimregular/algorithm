package TP.no6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int n, int m, int[] arr) {
    int answer = 0, lt = 0, cnt = 0;
    for (int rt = 0; rt < n; rt++) {
      if (arr[rt] == 0) {
        cnt++;
      }
      while (cnt > m) {
        if (arr[lt] == 0) {
          cnt--;
        }
        lt++;
      }
      answer = Math.max(answer, rt - lt + 1);
    }
    return answer;
  }
}

public class no6 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("TP/no6/no6.txt"));
    int n = rd.nextInt();
    int m = rd.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = rd.nextInt();
    }
    System.out.println(T.solution(n, m, arr));
  }
}
