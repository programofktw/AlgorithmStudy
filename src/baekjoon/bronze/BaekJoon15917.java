package baekjoon.bronze;

import java.io.*;

public class BaekJoon15917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Q = Integer.parseInt(br.readLine());

        for (int i = 0; i < Q; i++) {
            long a = Long.parseLong(br.readLine());
            if ((a & (a - 1)) == 0) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}