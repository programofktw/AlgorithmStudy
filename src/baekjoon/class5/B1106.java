package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class B1106 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 각 인원수 별로 드는 최소 코스트를 관리
        // 각 늘릴 수 있는 인원수를 관리 A

        // 1 ~ 늘리고 싶은 사람 수 c 까지 순차적으로 인원수라 치고 드는 최소 코스트를 계산
            // 구하는 공식은 dp[index] > 인원수 A의 코스트 + dp[index-A] 면 값 갱신

        String[] input = br.readLine().split(" ");

        int c = Integer.parseInt(input[0]);
        int town = Integer.parseInt(input[1]);

        int temp= 0;

        int[] dp = new int[c+1];

        Arrays.fill(dp,Integer.MAX_VALUE);

        HashSet<Node> set = new HashSet<>();

        int minCost = Integer.MAX_VALUE;

        for(int i =0;i<town;i++){
            input = br.readLine().split(" ");

            int cost = Integer.parseInt(input[0]);
            int plus = Integer.parseInt(input[1]);

            if(plus > c) plus = c;
            if(dp[plus] > cost){
                dp[plus] = cost;
                set.add(new Node(cost,plus));
            }
            if(minCost > cost){
                minCost = cost;
                temp = plus;
            }
        }


        for(int i = 1;i<temp ;i++){
            dp[i] = minCost;
        }


        for(int i = 2;i<=c;i++){
            for(Node node : set){
                if(i-node.plus >= 1){
                    if(dp[i] > dp[i-node.plus] + dp[node.plus]){
                        dp[i] = dp[i-node.plus] + dp[node.plus];
                    }
                }
            }
        }

        sb.append(dp[c]);

        System.out.print(sb);

    }

    static class Node{
        int cost;
        int plus;

        Node(int cost, int plus){
            this.cost = cost;
            this.plus = plus;
        }
    }

}
