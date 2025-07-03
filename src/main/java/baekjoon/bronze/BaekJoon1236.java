package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon1236 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();

        int w = scan.nextInt();
        scan.nextLine();
        char[][] castle = new char[h][w];
        boolean[] monitorX = new boolean[w];
        boolean[] monitorY = new boolean[h];
        for(int i = 0; i <h ;i++){
            String s = scan.nextLine();
            for(int j = 0 ; j < w ; j++){
                castle[i][j] = s.charAt(j);
                if(castle[i][j]=='X'){
                    monitorY[i] = true;
                    monitorX[j] = true;
                }
            }
        }

        int countX = 0;
        int countY = 0;

        for(int i = 0; i<h;i++){
            if(!monitorY[i]) countY++;
        }
        for(int i = 0 ; i<w;i++){
            if(!monitorX[i]) countX++;
        }

        int result = Math.max(countX, countY);

        System.out.println(result);



    }
}
