package bkd.base_code_create2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10093 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long[] inputs = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).sorted().toArray();

        long diff =inputs[1]-inputs[0]-1;

        sb.append(Math.max(diff, 0)).append("\n");

        for(long i = inputs[0]+1;i<inputs[1];i++){
            sb.append(i).append(" ");
        }


        System.out.print(sb);
    }
}
