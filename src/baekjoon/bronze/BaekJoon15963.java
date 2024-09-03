package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon15963 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        System.out.println((N==M)?1:0);
    }
}
