package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B16625 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int p = scan.nextInt();

        int q = scan.nextInt();

        int s = scan.nextInt();

        boolean is = false;
        if(p*q<=s){
            is=true;
        }else{
            int min = Math.min(p,q);

            for(int i = min;i<=s;i++){
                if(i%p==0&&i%q==0){
                    is=true;
                    break;
                }
            }
        }

        sb.append(is?"yes":"no");

        System.out.print(sb);
    }

}
