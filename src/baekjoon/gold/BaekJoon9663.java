package baekjoon.gold;

import java.util.Scanner;

/*
N-Queen 문제.
N X N 크기의 체스판 위에서 퀸 N개를 서로 공격할 수 없게 놓는 문제
N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성

입력이 하나임으로 Scanner 사용
출력이 하나임으로 Syso 사용
 */
public class BaekJoon9663 {

    private static boolean[][] field ;
    private static boolean[] visitedX;
    private static int N;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        int result =0;
        field = new boolean[N][N];
        visitedX = new boolean[N];
        for(int i = 0 ; i < N;i++){
            visitedX[i] = true;
            field[0][i] = true;
            result += backTraking(1);

            visitedX[i] = false;
            field[0][i] = false;
        }
        System.out.println(result);
    }


    public static int backTraking(int y){
        int result = 0;
        if(y==N){
            return 1;
        }
        else{
            for(int i =0;i<N;i++){
                if(!visitedX[i]){
                    if(canDrop(i,y)){
                        visitedX[i] = true;
                        field[y][i] = true;
                        result += backTraking(y+1);
                        visitedX[i] = false;
                        field[y][i] = false;
                    }
                }
            }
            return result;
        }
    }

    public static boolean canDrop(int x, int y){

        boolean left=true;
        boolean right = true;

        if(x>0) left = leftSide(x-1,y-1);
        if(x<N-1) right = rightSide(x+1,y-1);
        return left&&right;
    }

    public static boolean leftSide(int x, int y){
        if(field[y][x]){
            return false;
        }

        if(y==0) return true;
        else{
            if(x>0) return leftSide(x-1,y-1);
            else return true;
        }
    }

    public static boolean rightSide(int x, int y){
        if(field[y][x]){
           return false;
        }

        if(y==0) return true;
        else{
            if(x<N-1) return rightSide(x+1,y-1);
            else return true;
        }
    }

    public static void printFiled(){
        for(int i =0 ;i<N;i++){
            for(int j =0;j<N;j++){
                if(field[i][j]) System.out.print("O");
                else System.out.print("X");
            }
            System.out.println();
        }
    }

}
