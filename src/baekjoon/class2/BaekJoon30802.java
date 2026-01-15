package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        int[] size = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        while(st.hasMoreTokens()){
            size[i++] = Integer.parseInt(st.nextToken());
        }

        int[] set = new int[2];


        st = new StringTokenizer(br.readLine());

        set[0] = Integer.parseInt(st.nextToken());

        set[1] = Integer.parseInt(st.nextToken());

        int tnum =0;

        for(int j = 0; j<6;j++){
            if(size[j]==0) continue;
            tnum += size[j]/set[0];

            tnum += (size[j]%set[0]!=0)?1:0;
        }

        int pset = total / set[1];
        int pnum = total % set[1];

        System.out.println(tnum);

        System.out.println(pset+" "+pnum);
    }
}
