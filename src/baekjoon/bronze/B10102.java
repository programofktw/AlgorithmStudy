package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10102 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
//        br.readLine();
//
//        String st = br.readLine();
//
//        int total = st.length();
//
//        st = st.replace("A","");
//
//        int BNum = st.length();
//
//        double mid = (double)total/2;
//
//        if(mid>BNum){
//            sb.append("A");
//        }else if(mid == BNum){
//            sb.append("Tie");
//        }else{
//            sb.append("B");
//        }
//
//        System.out.print(sb);
        br.readLine();

        String s = br.readLine();

        int count=0;

        for(int i =0;i<s.length();i++){
            char vote = s.charAt(i);


            count += (vote=='A')?1:-1;
        }

        if(count==0){
            sb.append("Tie");
        }else{
            sb.append((count>0)?"A":"B");
        }

        System.out.print(sb);
    }
}
