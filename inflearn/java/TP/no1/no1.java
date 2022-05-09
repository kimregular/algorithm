package TP.no1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
    ArrayList<Integer> answer = new ArrayList<>();
    int p1 = 0, p2 = 0;
    while (p1 < n && p2 < m) {
      if (arr1[p1] < arr2[p2]) {
        answer.add(arr1[p1++]);
      } else {
        answer.add(arr2[p2++]);
      }
    }
    while (p1 < n) {
      answer.add(arr1[p1++]);
    }
    while (p2 < m) {
      answer.add(arr2[p2++]);
    }

    return answer;
  }
}

public class no1 {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    Scanner rd = new Scanner(new File("TP/no1/no1.txt"));
    int n = rd.nextInt();
    int[] arr1 = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = rd.nextInt();
    }
    int m = rd.nextInt();
    int[] arr2 = new int[m];
    for (int i = 0; i < m; i++) {
      arr2[i] = rd.nextInt();
    }
    for (int x : T.solution(n, arr1, m, arr2)) {
      System.out.print(x + " ");
    }
  }
}
