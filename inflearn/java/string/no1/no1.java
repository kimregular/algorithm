package string.no1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {

  public int solution(String str, char t) {
    int answer = 0;
    str = str.toUpperCase();
    t = Character.toUpperCase(t);
    //System.out.println(str+" "+t);
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == t) answer++;
    }

    return answer;
  }

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    BufferedReader rd = new BufferedReader(
      new FileReader("string/no1/no1.txt")
    );

    String str = rd.readLine();
    char c = rd.readLine().charAt(0);
    System.out.print(T.solution(str, c));
  }
}
