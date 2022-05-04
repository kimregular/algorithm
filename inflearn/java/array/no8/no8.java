package array.no8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int[] solution(int n, int[] arr) {
    int[] answer = new int[n];
    int cnt = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i] < arr[j]) {
          cnt++;
        }
      }
      answer[i] = cnt;
      cnt = 1;
    }
    return answer;
  }
}

public class no8 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no8/no8.txt"));
    int n = rd.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = rd.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }
}
