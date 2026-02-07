package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20254 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        long result = 0;

        int[] mul = {56,24,14,6};

        int i =0;
        while(st.hasMoreTokens()) {

            result += Long.parseLong(st.nextToken())*mul[i++];

        }

        System.out.println(result);
    }

}
