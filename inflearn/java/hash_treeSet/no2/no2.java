package hash_treeSet.no2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public String solution(String n1, String n2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        // HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : n1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
    
        for (char x : n2.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) - 1);
            if (map1.get(x) == 0) {
                map1.remove(x);
            }
        }
        for (char x : map1.keySet()) {
            if (map1.get(x) > 0) {
                answer = "NO";
                return answer;
            }
        }


        return answer;
    }  
    


}

public class no2 {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner rd = new Scanner(new File("hash_treeSet/no2/no2.txt"));
        String n1 = rd.nextLine();
        // rd.nextLine();
        String n2 = rd.nextLine();
        System.out.println(T.solution(n1, n2));
    }
}
