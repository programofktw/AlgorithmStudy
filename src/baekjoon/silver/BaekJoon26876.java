package baekjoon.silver;

import java.io.*;

public class BaekJoon26876 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first = br.readLine();

        int FH = Integer.parseInt(first.substring(0,2));
        int FM = Integer.parseInt(first.substring(3));

        String second = br.readLine();

        int SH = Integer.parseInt(second.substring(0,2));
        int SM = Integer.parseInt(second.substring(3));


        int DM = SM - FM;

        if(DM<0){
            DM = 60+DM;
            FH++;
        }

        int DH = ((SH-FH)>=0)?(SH-FH):24+(SH-FH);

        bw.write(String.valueOf(DM+DH));

        br.close();
        bw.flush();
        bw.close();
    }
}
