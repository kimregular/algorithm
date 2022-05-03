package array.no2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public int solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]);
    int small = arr[0];
    for (int i = 1; i < n; i++) {
      if (small < arr[i]) {
        small = arr[i];
        answer.add(arr[i]);
      }
    }

    return answer.size();
  }
}

public class no2 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no2/no2.txt"));
    int n = rd.nextInt();
    rd.nextLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = rd.nextInt();
    }
    System.out.println(T.solution(n, arr));
  }
}
