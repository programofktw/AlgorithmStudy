package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10830 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int[][] A = new int[N][N];


        //기본 배열 A 입력
        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int j =0;
            while(st.hasMoreTokens()){
                A[i][j++] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }


        int[][] result = pow(A, B);

        for(int i = 0 ; i<result.length;i++){
            for(int j =0 ; j<result.length;j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    private static int[][] pow(int[][] A, long power){

        //만약 제곱수가 1이면 본인을 반환.
        if(power == 1L) return A;

        int[][] temp = pow(A,power/2);

        int[][] result = mul(temp, temp);

        if(power % 2!=0) return mul(result,A);
        else return result;

    }

    private static int[][] mul(int[][] base, int[][] temp){
        int[][] result = new int[base.length][base.length];

        for(int i = 0;i<base.length;i++){
            for(int j = 0 ; j<base.length;j++){
                for(int h = 0 ; h <base.length;h++){
                    result[i][j] += ((base[i][h] * temp[h][j]) % 1000);
                }
                result[i][j] %= 1000;
            }
        }

        return result;
    }
}
