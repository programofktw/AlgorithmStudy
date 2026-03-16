package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B20233 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());

        int x = Integer.parseInt(br.readLine());

        int b = Integer.parseInt(br.readLine());

        int y = Integer.parseInt(br.readLine());

        int useed = Integer.parseInt(br.readLine());

        int aResult = ((useed - 30) * x);

        int bResult = ((useed - 45) * y);

        if(aResult<0){
            aResult = 0;
        }
        if(bResult <0){
            bResult = 0;
        }
        sb.append(a+aResult*21).append(" ").append(b+bResult*21);


        System.out.print(sb);
    }


}
