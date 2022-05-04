package array.no11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int n, int[][] arr) {
    int answer = 0, max = Integer.MIN_VALUE;
    for (int i = 1; i <= n; i++) {
      int cnt = 0;
      for (int j = 1; j <= n; j++) {
        for (int k = 1; k <= 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            cnt++;
            break;
          }
        }
      }
      if (cnt > max) {
        max = cnt;
        answer = i;
      }
    }

    return answer;
  }
}

public class no11 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no11/no11.txt"));
    int n = rd.nextInt();
    int[][] arr = new int[n + 1][6];
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < 6; j++) {
        arr[i][j] = rd.nextInt();
      }
    }
    System.out.println(T.solution(n, arr));
  }
}
