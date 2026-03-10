package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5074 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        while(true){
            String[] inputs = br.readLine().split(" ");

            if(inputs[0].equals("00:00")&&inputs[1].equals("00:00")) break;

            String[] first = inputs[0].split(":");

            String[] second = inputs[1].split(":");

            int h1 = Integer.parseInt(first[0]);
            int m1 = Integer.parseInt(first[1]);

            int h2 = Integer.parseInt(second[0]);
            int m2 = Integer.parseInt(second[1]);

            int rh = 0;
            int rm =0;

            rh = h1 + h2;
            rm = m2 + m1;

            boolean overDay = false;

            if(rm>=60){
                rh++;
                rm-=60;
            }

            int day =0;


            if(rh>=24){
                overDay= true;
                day = rh / 24;
                rh %= 24;

            }

            sb.append(String.format("%02d",rh)).append(":").append(String.format("%02d",rm)).append((overDay)?" +"+day:"").append("\n");
        }


        System.out.print(sb);
    }

}
