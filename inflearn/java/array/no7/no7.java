package array.no7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

  public int solution(int n, int[] arr) {
    int answer = 0, cnt = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        cnt++;
        answer += cnt;
      } else {
        cnt = 0;
      }
    }
    return answer;
  }
}

public class no7 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no7/no7.txt"));
    int n = rd.nextInt();
    rd.nextLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = rd.nextInt();
    }
    System.out.println(T.solution(n, arr));
  }
}
