package TP.no4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int n, int m, int[] arr) {
    int answer = 0, sum = 0, lt = 0;
    for (int rt = 0; rt < n; rt++) {
      sum += arr[rt];
      if (sum == m) {
        answer++;
      }
      while (sum > m) {
        sum -= arr[lt++];
        if (sum == m) {
          answer++;
        }
      }
    }

    return answer;
  }
}

public class no4 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("TP/no4/no4.txt"));
    int n = rd.nextInt();
    int m = rd.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = rd.nextInt();
    }
    System.out.println(T.solution(n, m, arr));
  }
}
