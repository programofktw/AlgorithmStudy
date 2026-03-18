package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2167 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int[] inputs = inputIntArray(br.readLine());

        int col = inputs[0];
        int row = inputs[1];

        int[][] array = new int[col][row];

        for(int i= 0;i<col;i++){
            inputs = inputIntArray(br.readLine());
            for(int j = 0 ; j<row;j++){
                array[i][j] = inputs[j];
            }
        }

        int testCase = Integer.parseInt(br.readLine());

        while(testCase-->0){
            inputs = inputIntArray(br.readLine());

            long result = 0;
            int N = inputs[0]-1;
            int M = inputs[1]-1;

            int X = inputs[2]-1;
            int Y = inputs[3]-1;

            for(int i = N;i<=X;i++){
                for(int j = M ; j<=Y;j++){
                    result += array[i][j];
                }
            }
            sb.append(result).append("\n");
        }


        System.out.print(sb);
    }

    static int[] inputIntArray(String input) throws IOException {
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }


}
