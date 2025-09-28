package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon17070 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static boolean[][] field;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        field = new boolean[n][n];

        StringTokenizer st ;

        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());


            int j =0;
            while(st.hasMoreTokens()){
                //갈 수 있음 true
                //없으면 false;
                field[i][j++] = st.nextToken().equals("0");
            }
        }




        //가로 x, y 에서 가로 방향으로 파이프를 두었을 때 가능한 경우의 수
        long[][] gdp = new long[n][n];

        //가로 x, y 에서 세로ㅜ방향으로 파이프를 두었을 때 가능한 경우의 수
        long[][] sdp = new long[n][n];

        //가로 x, y 에서 대각 방향으로 파이프를 두었을 때 가능한 경우의 수
        long[][] cdp = new long[n][n];

        gdp[0][1] = 1;


        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (!field[y][x]) continue; // 벽이면 스킵

                // 가로 -> 가로, 대각선
                if (canRightMove(x,y,n)) {
                    gdp[y][x + 1] += gdp[y][x]; // 가로 유지
                    gdp[y][x + 1] += cdp[y][x]; // 대각선에서 가로
                }

                // 세로 -> 세로, 대각선
                if (canDownMove(x,y,n)) {
                    sdp[y + 1][x] += sdp[y][x]; // 세로 유지
                    sdp[y + 1][x] += cdp[y][x]; // 대각선에서 세로
                }

                // 대각선 -> 가로/세로/대각선
                if (canCrossMove(x,y,n)) {
                    cdp[y + 1][x + 1] += gdp[y][x]; // 가로 → 대각선
                    cdp[y + 1][x + 1] += sdp[y][x]; // 세로 → 대각선
                    cdp[y + 1][x + 1] += cdp[y][x]; // 대각선 → 대각선
                }
            }
        }

        long result = gdp[n - 1][n - 1] + sdp[n - 1][n - 1] + cdp[n - 1][n - 1];


        System.out.print(result);

     
    }

    static boolean canMove(int x, int y, int n ){
        return (x < n && x >= 0 && y < n && y >= 0)&&field[y][x];
    }

    static boolean canRightMove(int x, int y, int n  ){
        return canMove(x+1,y,n);
    }

    static boolean canDownMove(int x, int y, int n  ){
        return canMove(x,y+1,n);
    }

    static boolean canCrossMove(int x, int y, int n){
        return canMove(x+1,y,n)&&canMove(x+1,y+1,n)&&canMove(x,y+1,n);
    }
}
