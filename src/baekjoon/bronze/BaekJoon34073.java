package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon34073 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            System.out.print(st.nextToken()+"DORO ");
        }
    }
}
