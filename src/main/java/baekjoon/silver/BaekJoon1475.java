package baekjoon.silver;

import java.util.Scanner;

public class BaekJoon1475 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        int[] numTable = new int[9];

        for(int i = 0; i<s.length();i++){
            char now = s.charAt(i);
            if(now == '9') now = '6';
            numTable[now-'0']++;
        }

        numTable[6] = (numTable[6]%2==0)?numTable[6]/2:numTable[6]/2+1;

        int max=0;

        for(int i = 0 ; i<9;i++){
            if(max < numTable[i]) max = numTable[i];
        }

        System.out.println(max);
    }
}
