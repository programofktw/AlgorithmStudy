package baekjoon.bronze;

import java.util.HashSet;
import java.util.Set;

public class BaekJoon16972 {
    public static void main(String[] args) {
        int count = 814;
        int min = -8140;
        int max = 8140;
        int range = max - min + 1;

        Set<String> pairs = new HashSet<>();

        while (pairs.size() < count) {
            int a = (int)(Math.random() * range) + min;
            int b = (int)(Math.random() * range) + min;
            String pair = a + "," + b; // 쌍을 문자열로 표현
            pairs.add(pair);
        }

        // 출력
        for (String pair : pairs) {
            System.out.println(pair.replace(",", " "));
        }
    }
}
