package bkd.base_code_create2;

import basic.datastructure.list.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2587 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int[] inputs = new int[5];

        int average = 0;

        int middle = 0;

        for(int i = 0 ; i<5;i++){
            int input = Integer.parseInt(br.readLine());
            average+=input;
            inputs[i] = input;
        }

        Arrays.sort(inputs);

        sb.append(average/5).append("\n");

        sb.append(inputs[2]);

        System.out.print(sb);
    }
}
