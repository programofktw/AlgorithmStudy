package baekjoon.bronze;

import kotlin._Assertions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제 번호 : 21623

문제 이름 : GAME

문제 :
특정 시작(N) 수를 기준으로

N개의 난 수가 생성됩니다.

이때 해당
 */
public class BaekJoon21623 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");

        int k = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);

        int round = 0;
        int last = n;

        int[] secondLine = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int now : secondLine){
            if(last==0){
                last = n;
            }
            int temp = last- now;
            if(temp>=0) last = temp;
            if(temp==0){
                round++;
            }
        }

        System.out.println(round);
        System.out.println(last);
    }
}
