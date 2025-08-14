package baekjoon.silver;

import java.util.Scanner;
public class BaekJoon15779 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] input = new int[N];

        for(int i= 0;i<N;i++){
            input[i]= scan.nextInt();
        }

        int maxleng = 2;
        int cnt = 2;
        for(int i = 0 ;i<N-2;i++){
            if (input[i] <= input[i+1] && input[i+1] <= input[i+2]) cnt = 2;

            else if (input[i] >= input[i+1] && input[i+1] >= input[i+2])
            cnt = 2;

        	else
            cnt += 1;

            maxleng = Math.max(maxleng,cnt);
        }

        System.out.println(maxleng);
    }

}
