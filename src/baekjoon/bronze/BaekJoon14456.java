package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon14456 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        int T = scan.nextInt();

        int FC;
        int SC;


        //0 - 1 - 묵 2 - 찌 3 - 빠 // 1 > 2 > 3 > 1
        //1 - 1 - 묵 2 - 빠 3 - 찌 // 1 < 2 < 3 < 1
        //2 - 1 - 찌 2 - 묵 3 - 빠 // 1 < 2 < 3 < 1
        //3 - 1 - 찌 2 - 빠 3 - 묵 // 1 > 2 > 3 > 1
        //4 - 1 - 빠 2 - 찌 3 - 묵 // 1 < 2 < 3 < 1
        //5 - 1 - 빠 2 - 묵 3 - 찌 // 1 > 2 > 3 > 1
        //저장 되는 값 각 경우에서 1번 소가 이기는 수.
        int[] FWIN = new int[2];

        for(int i = 0 ;i<T;i++){
            FC = scan.nextInt();
            SC = scan.nextInt();
            if((FC==1&&SC==2)||(FC==2&&SC==3)||(FC==3&&SC==1)) FWIN[0]++;
            if((FC==1&&SC==3)||(FC==2&&SC==1)||(FC==3&&SC==2)) FWIN[1]++;
        }

        System.out.println(Math.max(FWIN[0],FWIN[1]));
    }

}
