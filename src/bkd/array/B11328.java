package bkd.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11328 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        int[] alph;

        while(n-->0){
            String[] input = br.readLine().split(" ");
            alph = new int['z'-'a'+1];

            boolean possible = true;
            for(int i = 0 ; i < input[0].length();i++){
                char first =  input[0].charAt(i);
                alph[first-'a']++;
            }

            for(int i = 0 ; i < input[1].length();i++){
                char second = input[1].charAt(i);
                alph[second-'a']--;
            }

            for(int i = 0; i <alph.length;i++){
                if(alph[i]!=0){
                    possible = false;
                }
            }

            if(possible){
                sb.append("Possible");
            }else{
                sb.append("Impossible");
            }
            sb.append("\n");

        }

        System.out.print(sb);
    }

}
