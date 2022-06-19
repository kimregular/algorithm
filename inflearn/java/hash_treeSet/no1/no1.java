package hash_treeSet.no1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}


public class no1 {
    public static void main(String[] args) throws   IOException {
        Main T = new Main();
        Scanner rd = new Scanner(new File("hash_treeSet/no1/no1.txt"));
        int n = rd.nextInt();
        rd.nextLine();
        String s = rd.nextLine();
        System.out.println(T.solution(n, s));
    }
}