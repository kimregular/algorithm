package TP.no3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int n, int m, int[] arr) {
    int answer = 0;
    int cnt = 0;
    for (int i = 0; i < m; i++) {
      cnt += arr[i];
    }
    answer = cnt;
    for (int i = m; i < n; i++) {
      cnt = arr[i] - arr[i - m];
      answer = Math.max(answer, cnt);
    }
    // 슬라이더
    return answer;
  }
}

public class no3_1 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("TP/no3/no3.txt"));
    int n = rd.nextInt();
    int m = rd.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = rd.nextInt();
    }
    System.out.println(T.solution(n, m, arr));
  }
}
