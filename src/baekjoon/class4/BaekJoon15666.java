package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*
N과 M 12번째 문제
수의 중복 뽑기는 인정하지만 순서는 상관하지 않는 방식
숫자의 종류가 3가지(A,B,C)이고 M이 4라면

A,B,C가 4를 나눠가지는 경우를 구하고 이를 출력하면 될 것 같음.

필요 조건 :
1. 정렬된 Set 형태의 자료구조


*/
public class BaekJoon15666 {

    static int M;
    static int N;
    static Set<Integer> nums = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] inputs = new int[N];

        int i  =0;
        while(st.hasMoreTokens()){
            inputs[i++] = (Integer.parseInt(st.nextToken()));
        }


        //중복을 제거 및 정렬
        for(int num : inputs){
            nums.add(num);
        }

        solved();

    }

    public static  void solved(){

        for(int num : nums){
            dfs(1,num,""+num);
        }

    }

    public static void dfs(int depth,int min, String now){
        if(depth==M){
            System.out.println(now);
            return;
        }

        for(int num : nums){
            if(min<=num)
                dfs(depth+1,num,now + " " + num);
        }
    }
}
