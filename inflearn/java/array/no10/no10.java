package array.no10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  int[] idx = { 1, 0, -1, 0 };
  int[] idy = { 0, 1, 0, -1 };

  public int solution(int n, int[][] arr) {
    int answer = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        boolean flag = true;
        for (int k = 0; k < 4; k++) {
          int nx = i + idx[k];
          int ny = j + idy[k];
          if (
            nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] > arr[i][j]
          ) {
            flag = false;
            break;
          }
        }
        if (flag) {
          answer++;
        }
      }
    }
    return answer;
  }
}

public class no10 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no10/no10.txt"));
    int n = rd.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = rd.nextInt();
      }
    }
    System.out.println(T.solution(n, arr));
  }
}
