package baekjoon.silver;

import java.util.Scanner;

public class BaekJoon1268 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int Num = scan.nextInt();
        int[][] Student = new int[Num][5];

        for(int i= 0; i<Student.length;i++){
            for(int j = 0; j<Student[i].length;j++){
                Student[i][j] = scan.nextInt();
            }
        }

        int num = Student.length;

        boolean[] visited;
        int[] result = new int[num];
        for(int i = 0; i<num;i++){
            visited = new boolean[num];
            visited[i] = true;
            for(int j =0;j<Student[i].length;j++){
                int base = Student[i][j];
                for(int h = 0; h<num;h++){
                    if(!visited[h]){
                        if(Student[i][j] == Student[h][j]) visited[h] = true;
                    }
                }
            }

            for(int j= 0 ; j<visited.length;j++){
                if(visited[j]) result[i]++;
            }
        }

        int MaxIndex = 0;
        int Max = 0;

        for(int i = 0; i<result.length;i++){
            if(result[i]>Max){
                MaxIndex = i;
                Max = result[i];
            }
        }

        System.out.println(MaxIndex+1);
    }
}
