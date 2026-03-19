package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B14625 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int startH = input[0];
        int startM = input[1];

        input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int endH = input[0];
        int endM = input[1];

        String want = br.readLine();


        int nowH = startH;
        int nowM = startM;

        int result = 0;
        while(true){


            String now = String.format("%02d%02d",nowH,nowM);


            if(now.contains(want)){
                result++;
            }

            if(nowH==endH&&nowM==endM){
                break;
            }

            nowM++;

            if(nowM==60){
                nowM=0;
                nowH++;
            }

        }

        sb.append(result);

        System.out.print(sb);
    }
}
