package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon20215 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());

        int h = Integer.parseInt(st.nextToken());

        int sq = w + h;

        double dagak = Math.sqrt(Math.pow(w,2)+Math.pow(h,2));

        System.out.printf("%.6f", sq-dagak);
    }
}
