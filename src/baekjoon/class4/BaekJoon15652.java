package baekjoon.class4;

import java.util.Scanner;

public class BaekJoon15652 {


    static int N;

    static int M;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        N  = scan.nextInt();

        M = scan.nextInt();


        for(int i = 1;i<=N;i++){
            dfs(1,i+"",i);
        }
    }

    public static void dfs(int depth, String now,int min){
        if(depth==M) System.out.println(now);

        else{
            for(int i= min;i<=N;i++){
                dfs(depth+1, now+" "+i,i);
            }
        }
    }

}
