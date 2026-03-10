package bkd.base_code_create2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    private static boolean done = false;

    public static void main(String[] args) throws IOException {

        int[] inputs = new int[9];

        for(int i = 0; i < inputs.length; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(inputs);

        backTraking(inputs, 1,inputs[0],1,inputs[0]+"");
        backTraking(inputs, 1,0,0,"");


        System.out.print(sb);
    }


    static void backTraking(int[] inputs, int index , int sum, int num,String result) {

        if(sum > 100||done||index>=9||num>7){
            return;
        }

        int nextNum = num+1;
        int nextSum = sum+inputs[index];
        String nextResult = result +"\n"+ inputs[index];

        if(nextNum == 7&&nextSum==100){
            done = true;
            sb.append(nextResult);
        }

        backTraking(inputs,index+1,sum,num,result);
        backTraking(inputs,index+1,nextSum,nextNum,nextResult);

    }

}
