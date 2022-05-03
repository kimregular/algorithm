package array.no4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public ArrayList<Integer> solution(int n) {
    ArrayList<Integer> answer = new ArrayList<>();
    for (int i = 0; i < 2; i++) {
      answer.add(1);
    }
    for (int i = 2; i < n; i++) {
      answer.add(answer.get(i - 1) + answer.get(i - 2));
    }
    return answer;
  }
}

public class no4 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("array/no4/no4.txt"));
    int n = rd.nextInt();
    for (int x : T.solution(n)) {
      System.out.print(x + " ");
    }
  }
}
