package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<N;i++){
            //암호화 이전
            int input = Integer.parseInt(st.nextToken());
            int de = decord(input);
            sb.append(de).append(" ");
        }

        System.out.println(sb);
    }


    public static int encord(int i){
        int j = i<<1;
        System.out.println(" "+Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
        System.out.println(Integer.toBinaryString(i^j));
        return i ^ j;
    }

    public static int decord(int i ){
        for(int j = 0 ;j<=256;j++){
            if(((j ^ (j<<1))%256)==i) return j;
        }

        return 0;
    }
}
