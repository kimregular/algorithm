package hash_treeSet.no3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public int[] solution(int n, int m, int[] arr) {
        int[] answer = new int[m];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < i + m; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
                if (map.get(arr[j]) != 0) {
                    map.put(arr[j], 1);
                }
            }
            for (int x : map.keySet()) {
                sum += map.get(x);
            }
            answer[i] = sum;
            sum = 0;
            map.clear();
        }
        
        return answer;
    }
}

public class no3 {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner rd = new Scanner(new File("hash_treeSet/no3/no3.txt"));
        int n = rd.nextInt();
        int m = rd.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt();
        }
        for (int x : T.solution(n, m, arr)) {
            System.out.print(x + " ");
        }
    }
}
