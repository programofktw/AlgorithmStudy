package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B23925 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());


        for(int i = 1 ; i <=testCase;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            long n = Long.parseLong(st.nextToken());

            long k = Long.parseLong(st.nextToken());

            long s = Long.parseLong(st.nextToken());

            long reset = k + n;

            long back = k+(k-s) + (n-s);

            sb.append(String.format("Case #%d: %d",i, Math.min(reset, back))).append("\n");
        }

        System.out.print(sb);
    }

}
