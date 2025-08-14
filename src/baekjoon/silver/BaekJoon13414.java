package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());

        int L = Integer.parseInt(st.nextToken());


        LinkedHashSet<String> set = new LinkedHashSet<>();

        for(int i = 0 ; i <L;i++){
            String code = br.readLine();
            set.remove(code);
            set.add(code);
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String code : set) {
            if (count++ == K) break;
            sb.append(code).append("\n");
        }
        System.out.print(sb);

    }
}
