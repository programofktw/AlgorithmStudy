package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1106 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        int c = Integer.parseInt(input[0]); // 목표 고객 수
        int n = Integer.parseInt(input[1]); // 도시 수

        int[] cost = new int[n];
        int[] people = new int[n];

        for(int i = 0; i < n; i++){
            input = br.readLine().split(" ");
            cost[i] = Integer.parseInt(input[0]);
            people[i] = Integer.parseInt(input[1]);
        }

        int[] dp = new int[c + 101];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i = 0; i < n; i++){
            for(int j = people[i]; j < c + 101; j++){
                if(dp[j - people[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j - people[i]] + cost[i]);
                }
            }
        }

        int answer = Integer.MAX_VALUE;

        for(int i = c; i < c + 101; i++){
            answer = Math.min(answer, dp[i]);
        }

        System.out.println(answer);
    }
}