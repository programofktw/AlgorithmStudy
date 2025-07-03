package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon9372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M  = Integer.parseInt(st.nextToken());

            for(int i = 0;i<M;i++){
                br.readLine();
            }

            sb.append((N-1)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }
}
