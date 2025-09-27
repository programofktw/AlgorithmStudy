package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon3711 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < testCase; i++){
            int studentNum = Integer.parseInt(br.readLine());

            int[] studentIds = new int[studentNum];

            for(int j = 0 ; j<studentNum;j++){
                studentIds[j] = Integer.parseInt(br.readLine());
            }

            HashSet<Integer> namage = new HashSet<>();
            int min = 0;
            A : while(true){
                namage.clear();
                min++;
                for(int id : studentIds){
                    int temp = id % min;

                    if(namage.contains(temp)) continue A;
                    else{
                        namage.add(temp);
                    }
                }
                sb.append(min).append("\n");
                break;
            }
        }

        System.out.print(sb);
    }
}
