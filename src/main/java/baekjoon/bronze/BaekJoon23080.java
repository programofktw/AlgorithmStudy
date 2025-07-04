package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon23080 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int term = scan.nextInt();

        String str = scan.next();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<str.length();i++){
            if(i%term == 0) sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }
}
