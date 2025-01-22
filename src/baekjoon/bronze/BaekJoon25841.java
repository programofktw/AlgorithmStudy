package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon25841 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int f = scan.nextInt();
        int s = scan.nextInt();

        String findNum = scan.next();
        int count = 0;
        for(int i=f ; i<=s;i++){
            String string = ""+i;

            for(int j=0;j<string.length();j++){
                if(string.charAt(j)==findNum.charAt(0)) count++;
            }
        }

        System.out.print(count);
    }
}
