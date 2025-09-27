package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10830_2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        long B = Long.parseLong(st.nextToken());

        int[][] A = new int[N][N];

        for(int i = 0 ; i < N;i++){
            st = new StringTokenizer(br.readLine());

            int j= 0;
            while(st.hasMoreTokens()){
                A[i][j++] = Integer.parseInt(st.nextToken())%1000;
            }
        }

        int[][] result = pow(A,B);

        for(int i = 0 ; i < result.length;i++){
            for(int j = 0 ; j< result.length;j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static int[][] pow(int[][] A, long B){

        if(B==1L) return A;

        int[][] temp = pow(A,B/2);

        int[][] result = mul(temp, temp);

        if(B%2!=0) result = mul(result, A);

        return result;
    }

    public static int[][] mul(int[][] o1, int[][] o2){
        int[][] temp = new int[o1.length][o1.length];

        for(int i = 0 ; i < o1.length;i++){
            for(int j = 0 ; j<o1.length;j++){
                for(int h = 0 ; h<o1.length;h++){
                    temp[i][j] += (o1[i][h] * o2[h][j])%1000;
                }
                temp[i][j] = temp[i][j] %1000;
            }
        }

        return temp;
    }
}
