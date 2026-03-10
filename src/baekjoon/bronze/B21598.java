package baekjoon.bronze;

import java.util.Scanner;

public class B21598 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            sb.append("SciComLove").append("\n");
        }

        System.out.print(sb);
    }

}
