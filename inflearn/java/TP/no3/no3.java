package TP.no3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthSpinnerUI;

class Main {

  public int solution(int n, int m, int[] arr) {
    int answer = 0;
    int cnt = 0;
    for (int i = 0; i < n - 3; i++) {
      for (int j = i; j < i + m; j++) {
        cnt += arr[j];
      }
      answer = Math.max(answer, cnt);
      cnt = 0;
    }
    return answer;
  }
}

public class no3 {

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
