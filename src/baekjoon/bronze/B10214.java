package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10214 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        int testCase = Integer.parseInt(br.readLine());


        while(testCase-->0){

            int kr = 0;
            int ys = 0;

            for(int i = 0 ; i<9;i++){
                int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                ys += input[0];

                kr += input[1];


            }
            if(ys>kr){
                sb.append("Yonsei").append("\n");
            }else if(kr==ys){
                sb.append("Draw").append("\n");
            }else{
                sb.append("Korea").append("\n");
            }

        }

        System.out.print(sb);
    }

}
