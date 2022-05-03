package array.no1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]);
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[i - 1]) {
        answer.add(arr[i]);
      }
    }
    return answer;
  }
}

public class no1 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no1/no1.txt"));
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
