package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class BaekJoon5575 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        for(int i = 0 ; i < 3;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            solution(st);
        }

    }

    public static void solution(StringTokenizer st){
        int startH = Integer.parseInt(st.nextToken());
        int startM = Integer.parseInt(st.nextToken());
        int startS = Integer.parseInt(st.nextToken());


        int endH = Integer.parseInt(st.nextToken());
        int endM = Integer.parseInt(st.nextToken());
        int endS = Integer.parseInt(st.nextToken());

        LocalTime end = LocalTime.of(endH, endM, endS);

        LocalTime result = end.minusHours(startH).minusMinutes(startM).minusSeconds(startS);

        System.out.printf("%d %d %d\n",result.getHour(), result.getMinute(), result.getSecond());
    }
}
