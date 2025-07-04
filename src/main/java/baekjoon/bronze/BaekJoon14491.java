package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon14491 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        int jin = 9;

        String result = "";



        while(T>0){
            result= (T%jin)+result;
            T/=jin;
        }

        System.out.println(result);

    }
}
