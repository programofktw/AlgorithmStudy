package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10833 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] students = new int[n];

        int[] apples = new int[n];

        boolean[] flag = new boolean[n];

        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            students[i] = Integer.parseInt(input[0]);

            apples[i] = Integer.parseInt(input[1]);
        }


        int i = 0;

        int result = 0;

        while(true){
            boolean done = true;
            for(int j = 0; j < n; j++){
                if(flag[j]){
                    continue;
                }
                if(students[j]*(i+1)>apples[j]){
                    flag[j] = true;
                    result += apples[j]-(students[j]*i);
                }else{
                    done = false;
                }
            }
            if(done){
                break;
            }
            i++;
        }

        sb.append(result);

        System.out.print(sb);
    }


}
