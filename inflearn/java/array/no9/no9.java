package array.no9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int n, int[][] arr) {
    int answer = Integer.MIN_VALUE;
    int sum1, sum2;
    for (int i = 0; i < n; i++) {
      sum1 = sum2 = 0;
      for (int j = 0; j < n; j++) {
        sum1 += arr[i][j];
        sum2 += arr[j][i];
      }
      answer = Math.max(answer, sum1);
      answer = Math.max(answer, sum2);
    }
    sum1 = sum2 = 0;
    for (int i = 0; i < n; i++) {
      sum1 += arr[i][i];
      sum2 += arr[i][n - i - 1];
    }
    answer = Math.max(answer, sum1);
    answer = Math.max(answer, sum2);
    return answer;
  }
}

public class no9 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no9/no9.txt"));
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
