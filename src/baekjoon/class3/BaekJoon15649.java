package baekjoon.class3;


import java.util.Scanner;

/*
 백트래킹 예제 문제라고 한다
 N X M (1)
 자연수 1 부터 N 까지 중복 없이 M개 고른 수열.
 */
public class BaekJoon15649 {

    private static int depth;
    private static int N;
    private static boolean visited[];
    private static StringBuilder sb= new StringBuilder();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        depth= scan.nextInt();


        for(int i= 1;i<=N;i++){
            visited = new boolean[N];
            visited[i-1]= true;
            dfs(i+"",1);
        }

        System.out.print(sb);
    }


    public static void dfs(String arr,int dep){
        if(dep==depth){
            sb.append(arr).append("\n");
            return;
        }

        for(int i=1;i<=N;i++){
            if(!visited[i-1]){
                visited[i-1] = true;
                dfs(arr+" "+i,dep+1);
                visited[i-1] = false;
            }
        }
    }

}
