package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon26876 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        StringTokenizer st = new StringTokenizer(br.readLine(),":");

        int FH = Integer.parseInt(st.nextToken().trim());
        int FM = Integer.parseInt(st.nextToken().trim());

        st = new StringTokenizer(br.readLine(),":");

        int SH = Integer.parseInt(st.nextToken());
        int SM = Integer.parseInt(st.nextToken());


        int DM = SM - FM;

        if(DM<0){
            DM = 60+DM;
            FH++;
        }

        int DH = ((SH-FH)>=0)?(SH-FH):24+(SH-FH);

        System.out.println((DH+DM));
    }
}
