package baekjoon.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제 번호 : 24736
이름 : FootBall Scoring

풋볼의 득점 방법 5가지
T 터치다운 - 6점
F 필드 골 - 3점
S 세이프티 - 2점
PC 포인트 애프터 - 1점
PT 포인트 컨버젼 - 2점이라고 할때

T F S PC PT 순으로 획득량이 주어질 때 총 점을 구하라
이 때 입력은 두팀으로 주어진다.

 */
public class BaekJoon24736 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 2;i++){

            int[] input = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();



            System.out.print((6*input[0]+3*input[1]+2*input[2]+input[3]+input[4]*2)+" ");

        }
    }

}
