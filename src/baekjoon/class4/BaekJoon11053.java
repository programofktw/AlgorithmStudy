package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
가장 긴 증가하는 부분 수열 문제

순서대로 탐색하되 현재를 포함할 지 말지를 둘 다 실행

=> 시간 초과 발생.
=> 시도 1. 입력의 시간을 줄여보기
 */
public class BaekJoon11053 {

    static int[] array;

    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N  = Integer.parseInt(br.readLine());
        array = new int[N];

        StringTokenizer input = new StringTokenizer(br.readLine(), " ");

        int i = 0;
        while(input.hasMoreTokens()){
            array[i++] = Integer.parseInt(input.nextToken());
        }


        int contain = backTraking(1,array[0],1);
        int notContain = backTraking(1,0,0);

        System.out.print(Math.max(contain,notContain));

    }

    //now : 현재 탐색하고자 하는 인덱스
    //last : 가장 마지막에 추가된 수(가장 큰 수)
    //count : 몇개의 수열이 포함되었는지
    private static int backTraking(int now,int last, int count){
       //만약 가장 마지막 인덱스까지 끝 마쳤다면(index는 0~N-1 까지) 결과를 반환
        if(now==N) return count;

        else{
            //포함하지 않았을 때
            int notContain = backTraking(now+1,last,count);
            //값의 범위가 1보다 크기 때문에 max에 걸려지도록 0으로 기본 값 설정
            int contain = 0;
            //현재 탐색 중인 인덱스의 수가 가장 마지막에 추가된 수보다 큰 경우 포함.
            if(array[now]>last) contain = backTraking(now+1,array[now],count+1);

            return Math.max(contain,notContain);
        }
    }
}
