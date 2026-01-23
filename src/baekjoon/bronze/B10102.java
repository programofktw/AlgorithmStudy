package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10102 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        br.readLine();

        String st = br.readLine();

        int total = st.length();

        st = st.replace("A","");

        int BNum = st.length();

        double mid = (double)total/2;

        if(mid>BNum){
            sb.append("A");
        }else if(mid == BNum){
            sb.append("Tie");
        }else{
            sb.append("B");
        }

        System.out.print(sb);
    }
}
