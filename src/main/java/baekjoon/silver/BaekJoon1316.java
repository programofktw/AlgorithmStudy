package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int result = 0;
        A : for(int i = 0 ; i <T;i++){
            //알파벳
            boolean[] visited = new boolean[26];

            String testCase = br.readLine();

            visited[testCase.charAt(0)-'a'] =true;

            for(int j = 1; j<testCase.length();j++){
                int index = testCase.charAt(j)-'a';
                if(!visited[index]){
                    visited[index] = true;
                }else{
                    if(testCase.charAt(j-1)!=testCase.charAt(j)) continue A;
                }
            }

            result++;
        }

        System.out.println(result);
    }
}
