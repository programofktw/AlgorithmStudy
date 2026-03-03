package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B6996 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());

        A : for(int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");
            int size = 'z' - 'a'+1;
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            sb.append(input[0]).append(" & ").append(input[1]).append(" are ");
            boolean result = false;

            for(char ch : input[0].toCharArray()) {
                arr1[ch - 'a']++;
            }

            for(char ch : input[1].toCharArray()) {
                arr2[ch- 'a']++;
            }

            for(int j = 0 ; j < size;j++){
                if(arr1[j]!=arr2[j]){
                    sb.append("NOT anagrams.").append("\n");
                    continue A;
                }
            }
            sb.append("anagrams.").append("\n");
        }

        System.out.print(sb);
    }
}
