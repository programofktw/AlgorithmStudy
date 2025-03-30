package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10026 {

    public static boolean[][] visited;

    public static boolean redGreen = false;

    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] lines = new String[100];

        N = input(lines, br);

        char[][] colors = new char[N][N];

        transportInput(lines,colors);

        visited = new boolean[N][N];

        findArea(colors);

        redGreen =true;
    }


    public static int input(String[] lines,BufferedReader br) throws IOException {
        int N = 0;

        //입력 받기
        while(true){
            String input = br.readLine();

            if(input==null) break;
            //N X N의 입력
            lines[N++] = input;
        }

        return N;
    }

    public static void transportInput(String[] lines, char[][] colors){
        for(int j = 0 ; j<lines.length;j++){
            String line = lines[j];
            for(int i = 0; i<line.length();i++){
                colors[j][i] = line.charAt(i);
            }
        }
    }

    public static void findArea(char[][] colors){

        int area = 0;
        for(int i= 0;i < colors.length;i++){
            for(int j =0;j<colors[i].length;j++){
                if(!visited[i][j]){
                    bfs(colors, i,j);
                    area++;
                }
            }
        }

        System.out.print(area+" ");
    }

    public static void bfs(char[][] colors,int h, int w){
        visited[h][w] = true;

        char color = colors[h][w];

        if(h-1>=0&&color == colors[h-1][w]){
            bfs(colors,h-1,w);
        }
        if(h+1<N && colors[h+1][w] == color){
            bfs(colors,h+1,w);
        }
        if(w-1>=0&&color == colors[h][w-1]){

        }
    }

}
