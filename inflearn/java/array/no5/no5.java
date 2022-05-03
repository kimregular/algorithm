package array.no5;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {

  public int solution(int n) {
    int answer = 0;
    int[] lst = new int[n + 3];
    Arrays.fill(lst, 0);
    for (int i = 2; i < n + 1; i++) {
      if (lst[i] == 0) {
        answer++;
      }
      for (int j = i; j < n + 1; j = j + i) {
        lst[j] = 1;
      }
    }
    return answer;
  }
}

public class no5 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no5/no5.txt"));
    int n = rd.nextInt();
    System.out.println(T.solution(n));
  }
}
