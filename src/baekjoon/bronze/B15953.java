package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15953 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String[] input = br.readLine().split(" ");

            int result =0;
            int first = Integer.parseInt(input[0]);
            if(first==0){

            }
            else if(first==1){
                result += 5000000;
            }else if(first<=3){
                result += 3000000;
            }else if(first<=6){
                result += 2000000;
            }else if(first<=10){
                result += 500000;
            }else if(first<=15){
                result += 300000;
            }else if(first<=21){
                result += 100000;
            }
            int second = Integer.parseInt(input[1]);
            if(second==0){

            }else if(second==1){
                result += 5120000;
            }else if(second<=3){
                result += 2560000;
            }else if(second<=7){
                result += 1280000;
            }else if(second<=15){
                result += 640000;
            }else if(second<=31){
                result += 320000;
            }

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}
