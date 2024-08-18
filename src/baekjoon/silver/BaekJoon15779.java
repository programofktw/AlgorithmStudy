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
//
//        //big = false;
//        //small = true;
//        boolean frontBig;
//        int maxLeng = 2;
//        int testleng=2;
//
//        if(input[1]>=input[0]){
//            frontBig = true;
//        }
//        else{
//            frontBig = false;
//        }
//
//        for(int i =2; i<N;i++){
//            boolean isBig = input[i]>=input[i-1];
//
//            if(frontBig&&!isBig){
//                testleng++;
//                frontBig = false;
//            }
//            else if(!frontBig&&isBig){
//                testleng++;
//                frontBig = true;
//            }
//            else {
//                if(testleng>maxLeng) maxLeng=testleng;
//                testleng = 2;
//            }
//        }
//        if(testleng>maxLeng) maxLeng = testleng;

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
