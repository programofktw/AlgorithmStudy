package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5365 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wordNum = Integer.parseInt(br.readLine());

        String[] words = br.readLine().split(" ");

        sb.append(words[0].charAt(0));
        for(int i = 1 ; i <wordNum;i++){
            if(words[i-1].length()>words[i].length()) sb.append(" ");
            else sb.append(words[i].charAt(words[i-1].length()-1));
        }

        System.out.print(sb);

    }
}
