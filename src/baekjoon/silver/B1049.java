package baekjoon.silver;

import basic.datastructure.list.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1049 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        String[] input = br.readLine().split(" ");

        int need = Integer.parseInt(input[0]);

        int brand = Integer.parseInt(input[1]);

        int setMin = Integer.MAX_VALUE;

        int numMin = Integer.MAX_VALUE;

        for(int i = 0 ; i < brand;i++){
            input = br.readLine().split(" ");

            setMin = Math.min(setMin, Integer.parseInt(input[0]));

            numMin = Math.min(numMin, Integer.parseInt(input[1]));
        }

        boolean cheapSet = setMin < numMin * 6;

        int result=0;

        int needSet = need / 6;
        int needNum = need % 6;

        if(cheapSet){
            result += needSet * setMin;

            if (needNum * numMin < setMin) {
                result += needNum * numMin;
            } else {
                result += setMin;
            }
        }else{
            result = need * numMin;
        }
        sb.append(result);
        System.out.print(sb);
    }

}
