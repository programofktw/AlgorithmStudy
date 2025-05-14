package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon15663 {

    static int[] array;
    static boolean[] visited;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");

        N  = Integer.parseInt(tokens[0]);
        M  = Integer.parseInt(tokens[1]);

        array = new int[N];
        visited = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        while(st.hasMoreTokens()){
            array[i++] = Integer.parseInt(st.nextToken());
        }

        //정렬
        Arrays.sort(array);

        for(int j = 0 ; j<N;j++){
            visited[j] = true;
            dfs(1,array[j]+"");
            visited[j] = false;
        }
    }

    static void dfs(int depth, String now){
        if(depth==M) System.out.println(now);

        else{
            for(int i = 0;i<N;i++){
                if(!visited[i]){
                    visited[i] = true;
                    dfs(depth+1,now+" "+array[i]);
                }
            }
        }

    }
}
