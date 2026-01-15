package basic.algorithm;

import java.io.BufferedReader;
import java.io.IOException;

public class AbstractGraphAlgorithm {
    protected static int[][] field;

    protected static boolean[][] visited;

    public void init(BufferedReader br) throws IOException {
        System.out.println("그래프의 크기는 가로 N, 세로 M으로 적용됩니다.");

        System.out.print("세로 N의 크기를 입력해주세요. : ");
        int N = Integer.parseInt(br.readLine());

        System.out.print("가로 M의 크기를 입력해주세요. : ");
        int M = Integer.parseInt(br.readLine());

        field = new int[N][M];

        visited = new boolean[N][M];
    }

    public void input(BufferedReader br) throws IOException {
        System.out.printf("그래프를 입력해주세요.\n 입력은 %d X %d의 크기로 작성해주시고, 열은 Enter, 행은 띄어쓰기로 구분해주세요.\n", field.length, field[0].length);

        for (int i = 0 ; i<  field.length ; i++) {
            String line = br.readLine();

            String[] rows = line.split(" ");

            int col =0;

            if (rows.length != field[0].length) {
                System.out.printf("%d번째 열의 입력값이 이상합니다. 확인해주세요.", i);
                throw new IOException();
            }
            for(String row : rows) {
                field[i][col++] = Integer.parseInt(row);
            }

        }
    }

    public void printAsGraph(){
        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printAsVisited(){
        for(boolean[] row : visited){
            for (boolean bol : row) {
                if(bol){
                    System.out.print("O ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
