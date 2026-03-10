package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11367 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < testCase;i++){
            String[] input = br.readLine().split(" ");

            int score = Integer.parseInt(input[1]);

            sb.append(input[0]).append(" ");
            if(score>=97){
                sb.append("A+");
            }else if(score>=90){
                sb.append("A");
            }else if(score>=87){
                sb.append("B+");
            }else if(score>=80){
                sb.append("B");
            }else if(score>=77){
                sb.append("C+");
            }else if(score>=70){
                sb.append("C");
            }else if(score>=67){
                sb.append("D+");
            }else if(score>=60){
                sb.append("D");
            }else{
                sb.append("F");
            }
            sb.append("\n");


        }

        System.out.print(sb);
    }

}
