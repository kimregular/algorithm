package hash_treeSet.no2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(char x : s2.toCharArray()){
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }
}

public class no2_1 {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner rd = new Scanner(new File("hash_treeSet/no2/no2.txt"));
        String s1 = rd.nextLine();
        String s2 = rd.nextLine();
        System.out.println(T.solution(s1, s2));
    }
}
