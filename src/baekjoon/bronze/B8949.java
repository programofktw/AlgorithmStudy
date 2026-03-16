package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B8949 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        String[] inputs = br.readLine().split(" ");

        int str1Len = inputs[0].length()-1;

        int str2Len = inputs[1].length()-1;


        boolean maxStr = str1Len>str2Len;

        int maxStrLen;

        int minStrLen;

        String shortStr = "";

        String longStr = "";
        if(maxStr){
            maxStrLen = str1Len;

            minStrLen = str2Len;

            shortStr = inputs[1];

            longStr = inputs[0];
        }else{
            maxStrLen = str2Len;

            minStrLen = str1Len;

            shortStr = inputs[0];

            longStr = inputs[1];
        }

        while(maxStrLen>=0){
            int shortNum;
            int longNum;

            if(minStrLen >= 0){
                shortNum = shortStr.charAt(minStrLen--)-'0';
            }else{
                shortNum = 0;
            }

            longNum = longStr.charAt(maxStrLen--)-'0';

            int temp = shortNum + longNum;

            sb.insert(0,temp);

        }





        System.out.print(sb);
    }

}
