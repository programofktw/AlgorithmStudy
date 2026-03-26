package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B14039 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int[] rows = new int[4];

        int[] cols = new int[4];

        for(int i = 0; i<4;i++){
            int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for(int j = 0;j<4;j++){
                rows[i] += inputs[j];
                cols[j] += inputs[j];
            }
        }

        int magic = rows[0];

        boolean isMasic = true;

        for(int i = 0;i<4;i++){
            if(magic!=rows[i]){
                isMasic = false;
            }

            if(magic!=cols[i]){
                isMasic =false;
            }
        }

        if(isMasic){
            sb.append("magic");
        }else{
            sb.append("not magic");
        }

        System.out.print(sb);
    }

}
