package bkd.base_code_create2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2438 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n  = Integer.parseInt(br.readLine());

        for(int i = 0 ;i<n ; i++){
            for(int j = 0 ; j<=i;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
