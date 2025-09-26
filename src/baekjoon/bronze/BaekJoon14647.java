package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon14647 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static int[][] bingo;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        bingo = new int[n][m];

        //가로로 9의 개수를 찾기 위해 하나의 String으로 구성하는 것
        String[] X9 = new String[n];

        //세로로 9의 개수를 찾기 위해 하나의 String으로 구성하는 것
        String[] Y9 = new String[m];

        //입력
        for(int i= 0 ; i < n ;i++){
            st = new StringTokenizer(br.readLine());

            int j =0;
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                X9[i]+= s;
                Y9[j++]+= s;
            }
        }


        int total9num =0;

        int max9Num = 0;
        for(int i = 0 ; i < n;i++){
            int temp9Num = 0;
            for(char text : X9[i].toCharArray()){
                if(text=='9'){
                    total9num++;
                    temp9Num++;
                }
            }
            max9Num = Math.max(temp9Num, max9Num);
        }

        for(int j = 0 ; j < m ; j++){
            int temp9Num = 0;
            for(char text : Y9[j].toCharArray()){
                if(text=='9'){
                    temp9Num++;
                }
            }
            max9Num = Math.max(temp9Num, max9Num);
        }

        System.out.print(total9num-max9Num);
    }
}
