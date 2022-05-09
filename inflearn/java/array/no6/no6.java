package array.no6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public boolean isPrime(int num) {
    if (num == 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int num = arr[i];
      int tmp = 0;
      while (num > 0) {
        tmp = tmp * 10 + (num % 10);
        num /= 10;
      }
      if (isPrime(tmp)) {
        answer.add(tmp);
      }
    }

    return answer;
  }
}

public class no6 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no6/no6.txt"));
    int n = rd.nextInt();
    rd.nextLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = rd.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }
}
