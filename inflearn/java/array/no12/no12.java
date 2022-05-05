package array.no12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int num1, int num2, int[][] arr) {
    int answer = 0;
    for (int i = 1; i <= num1; i++) {
      for (int j = 1; j <= num1; j++) {
        int cnt = 0;
        for (int k = 0; k < num2; k++) {
          int pi = 0, pj = 0;
          for (int s = 0; s < num1; s++) {
            if (arr[k][s] == i) {
              pi = s;
            }
            if (arr[k][s] == j) {
              pj = s;
            }
          }
          if (pi < pj) {
            cnt++;
          }
        }
        if (cnt == num2) {
          answer++;
        }
      }
    }
    return answer;
  }
}

public class no12 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no12/no12.txt"));
    int num1 = rd.nextInt();
    int num2 = rd.nextInt();
    int[][] arr = new int[num2][num1];
    for (int i = 0; i < num2; i++) {
      for (int j = 0; j < num1; j++) {
        arr[i][j] = rd.nextInt();
      }
    }
    System.out.println(T.solution(num1, num2, arr));
  }
}
