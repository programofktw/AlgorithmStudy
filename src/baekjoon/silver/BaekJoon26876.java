package baekjoon.silver;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon26876 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(scan.nextLine(),":");

        int FH = Integer.parseInt(st.nextToken().trim());
        int FM = Integer.parseInt(st.nextToken().trim());

        st = new StringTokenizer(scan.next(),":");

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
