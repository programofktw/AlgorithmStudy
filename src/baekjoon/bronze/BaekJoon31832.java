package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon31832 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i = 0 ; i< N;i++){
            String input = scan.next();

            if(input.length()>10) continue;

            int up = 0;
            int down = 0;
            int notNum =0;
            for(int j = 0 ; j<input.length();j++){
                char ch = input.charAt(j);

                if(ch>='a'&&ch<='z') down++;
                else if(ch>='A'&&ch<='Z') up++;
                else if(ch<'0'||ch>'9') notNum++;
            }
            if(down>=up&&down+up+notNum!=0){
                System.out.println(input);
            }

        }
    }
}
