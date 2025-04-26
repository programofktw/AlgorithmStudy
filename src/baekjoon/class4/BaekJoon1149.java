package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/*
문제 제목 : RGB 거리

N 개의 집을 RGB로 칠하는데 드는 각각 비용이 주어질때,
색이 연속되지 않는 경우 중 비용이 가장 작은 경우를 찾으시오
*/
public class BaekJoon1149 {

    static int[][] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        cost = new int[N][3];

        for(int i = 0 ;i<cost.length;i++){
            String[] costs = br.readLine().split(" ");
            cost[i][0] = Integer.parseInt(costs[0]);
            cost[i][1] = Integer.parseInt(costs[1]);
            cost[i][2] = Integer.parseInt(costs[2]);
        }

        int min = Integer.MAX_VALUE;

        min = Math.min(min,backTraking(0,0));

        min = Math.min(min,backTraking(1,0));

        min = Math.min(min,backTraking(2,0));

        System.out.println(min);
    }


    //nowColor : 지금 칠할 색(R0,G1,B2), index: 몇번째 집(0부터 카운트)인지.
    public static int backTraking(int nowColor,int index){
        if(cost.length==index) return 0;

        int min = Integer.MAX_VALUE;

        for(int i =0;i<3;i++){
            if(nowColor!=i) min = Math.min(min,backTraking(i,index+1));
        }

        return cost[index][nowColor] +min;

    }
}
