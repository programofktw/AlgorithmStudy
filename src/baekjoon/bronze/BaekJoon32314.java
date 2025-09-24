package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon32314 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int first = Integer.parseInt(br.readLine());

        StringTokenizer st  = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());

        int v = Integer.parseInt(st.nextToken());

        if(first<=w/v) System.out.print(1);
        else System.out.print(0);
    }
}
