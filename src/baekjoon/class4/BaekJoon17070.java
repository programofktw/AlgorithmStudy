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

        //대각, 가로, 세로
        int[][] move = {{1,1},{1,0},{0,1}};
        //가로
        long[][] gdp = new long[n][n];
        //세로
        long[][] sdp = new long[n][n];
        //대각
        long[][] cdp = new long[n][n];


        for(int i = n-1 ; i>=0;i--){
            for(int j = n-1;j>=0;j--){
                //도착지 초기화.
                if(i==n-1&&j==n-1){
                    gdp[n-1][n-1] = 0;
                    sdp[n-1][n-1] = 0;
                    cdp[n-1][n-1] = 0;
                    continue;
                }

                //도착지 위칸
                if(i==n-2&&j==n-1){
                   gdp[i][j] = 0;
                   sdp[i][j] = 1;
                   cdp[i][j] = 0;
                   continue;
                }

                if(i==n-2&&j==n-2){
                    gdp[i][j] = 0;
                    sdp[i][j] = 0;
                    cdp[i][j] = 1;
                    continue;
                }
                if(i==n-1&&j==n-2){
                    gdp[i][j] = 1;
                    sdp[i][j] = 0;
                    cdp[i][j] = 0;
                    continue;
                }

                for(int h=0;h<3;h++){
                    int nextX = j + move[h][0];
                    int nextY = i + move[h][1];
                    if(h==0){
                        if(canCrossMove(j,i,n)){
                            cdp[i][j] += cdp[nextY][nextX] + gdp[nextY][nextX] + sdp[nextY][nextX];
                        }
                        //가로
                    }else if(h==1){
                        if(canRightMove(j,i,n)){
                            gdp[i][j] += cdp[nextY][nextX] + gdp[nextY][nextX];
                        }
                        //세로
                    }else{
                        if(canDownMove(j,i,n)){
                            sdp[i][j] += cdp[nextY][nextX] + sdp[nextY][nextX];
                        }
                    }
                }
            }
        }

        long result = 0 ;

        result = gdp[0][0];

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
