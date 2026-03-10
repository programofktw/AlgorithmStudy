package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3533 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        boolean[] bit = new boolean[10];

        for(int i = 0; i < bit.length; i++){
            bit[i] = input[i].equals("1");
        }

        boolean result = false;

        for(int i= 0; i < bit.length; i++){
            boolean temp;
            for(int j = i+1 ; j < bit.length ; j++){
                temp = bit[i] || bit[j];

                result = (temp&&!result ||!temp&&result);

                for(int k = j+1 ; k < bit.length ;k++){
                    temp = bit[i]||bit[j] || bit[k];

                    result = (temp&&!result ||!temp&&result);
                }
            }
        }

        sb.append(result?1:0);

        System.out.println(sb);
    }

}
