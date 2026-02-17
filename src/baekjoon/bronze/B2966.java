package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2966 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        char[] answers = br.readLine().toCharArray();

        char[][] ga = {{'A','B','C'},{'B', 'A', 'B', 'C'},{'C', 'C', 'A', 'A', 'B', 'B'}};


        int adrian = 0;
        int bruno = 0;
        int goran = 0;

        int roop = 0;

        int max =0;

        for(char answer : answers){
            if(answer == ga[0][roop%3]){
                adrian++;
                max = Math.max(adrian,max);
            }
            if(answer == ga[1][roop%4]){
                bruno++;
                max = Math.max(bruno,max);
            }
            if(answer == ga[2][roop%6]){
                goran++;
                max = Math.max(goran,max);
            }
            roop++;
        }

        sb.append(max).append("\n");
        if(max == adrian){
            sb.append("Adrian").append("\n");
        }
        if(max == bruno){
            sb.append("Bruno").append("\n");
        }
        if(max == goran){
            sb.append("Goran");
        }
        System.out.print(sb);
    }

}
