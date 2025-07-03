package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2096 {

    static int[][] maxField;
    static int[][] minField;

    static int[][] field;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        field = new int[N][3];
        maxField = new int[N][3];
        minField = new int[N][3];


        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            field[i][0] = Integer.parseInt(st.nextToken());

            field[i][1] = Integer.parseInt(st.nextToken());

            field[i][2] = Integer.parseInt(st.nextToken());
        }

        solved(N);

    }



    static void solved(int N){
        for(int i = 0;i<3;i++) {
            maxField[N-1][i] = field[N-1][i];
            minField[N-1][i] = field[N-1][i];
        }

        for(int i = N-2;i>=0;i--){
            for(int j=0;j<3;j++){
                maxField[i][j] = searchMax(i,j)+field[i][j];
                minField[i][j] = searchMin(i,j)+field[i][j];
            }
        }

        System.out.println(Math.max(maxField[0][0],Math.max(maxField[0][1],maxField[0][2])));
        System.out.println(Math.min(minField[0][0],Math.min(minField[0][1],minField[0][2])));
    }

    static int searchMax(int floor,int index){
        int left = Integer.MIN_VALUE;
        int mid = Integer.MIN_VALUE;
        int right= Integer.MIN_VALUE;

        if(index-1>=0){
            left = maxField[floor+1][index-1];
        }

        mid = maxField[floor+1][index];

        if(index+1<3){
            right = maxField[floor+1][index+1];
        }

        return Math.max(left, Math.max(mid, right));

    }

    static int searchMin(int floor, int index){
        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if(index-1>=0){
            left = minField[floor+1][index-1];
        }

        mid = minField[floor+1][index];

        if(index+1<3){
            right = minField[floor+1][index+1];
        }

        return Math.min(left, Math.min(mid, right));

    }

}

