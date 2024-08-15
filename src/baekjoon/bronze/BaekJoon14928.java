package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon14928 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            String input = scan.next();

            long reminder = 0;

            for(int i = 0; i<input.length();i++){
                reminder = (reminder * 10 +(input.charAt(i) - '0')) % 20000303;
            }
            System.out.println(reminder);
        }
}
