package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
가장 긴 증가하는 부분 수열 문제

순서대로 탐색하되 현재를 포함할 지 말지를 둘 다 실행

=> 시간 초과 발생.
=> 시도 1. 입력의 시간을 줄여보기
=> 시도 2. dp 이용.
 */
public class BaekJoon11053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int[] dp = new int[N];  // dp[i] = i를 마지막 원소로 하는 LIS의 길이

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

       for(int i = 0 ;i<N;i++){
           dp[i]=1;
           for(int j=0;j<i;j++){
               if(array[j] < array[i]) {
                   dp[i] = Math.max(dp[i], dp[j] + 1);
               }
           }
       }
    }
}
