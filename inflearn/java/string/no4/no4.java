package string.no4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {

  public ArrayList<String> solution(String[] str) {
    ArrayList<String> answer = new ArrayList<>();
    for (String x : str) {
      String tmp = new StringBuilder(x).reverse().toString();
      answer.add(tmp);
    }
    return answer;
  }
}

public class no4 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("string/no4/no4.txt"));
    int n = rd.nextInt();
    String[] str = new String[n];
    for (int i = 0; i < n; i++) {
      str[i] = rd.nextLine();
    }
    for (String x : T.solution(str)) {
      System.out.println(x);
    }
  }
}
