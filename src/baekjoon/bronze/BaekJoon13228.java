package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon13228 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<testCase;i++){
            String[] line = br.readLine().split(" ");

            int moveX = Math.abs(Integer.parseInt(line[0]) - Integer.parseInt(line[3]));

            int moveY = Math.abs(Integer.parseInt(line[1]) - Integer.parseInt(line[4]));

            int moveZ = Integer.parseInt(line[2])+ Integer.parseInt(line[5]);

            sb.append(moveY+moveX+moveZ).append("\n");
        }

        System.out.print(sb);


    }
}
