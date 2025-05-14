package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon15663 {

    static int[] array;

    static Map<Integer, Integer> input= new HashMap<>();
    static int N;
    static int M;
    static boolean[] visited;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");

        N  = Integer.parseInt(tokens[0]);
        M  = Integer.parseInt(tokens[1]);
        visited = new boolean[N];
        array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        while(st.hasMoreTokens()){
            array[i++] = Integer.parseInt(st.nextToken());
        }

        //정렬
        Arrays.sort(array);
        //dfs 풀이 부분
/*        for(int num : array){
//            if(input.containsKey(num)){
//                input.put(num,input.get(num)+1);
//            }else{
//                input.put(num,1);
//            }
//        }
//
//        for(int num : input.keySet()){
//            input.put(num,input.get(num)-1);
//            dfs(1,num+"");
//            input.put(num,input.get(num)+1);
//        }*/



        backTraking(0,"");

        System.out.print(sb);
    }

    static void dfs(int depth, String now){
        if(depth==M) System.out.println(now);

        else{
            for(int num : input.keySet()){
                if(input.get(num)>0){
                    input.put(num,input.get(num)-1);
                    dfs(depth,now+" "+num);
                    input.put(num,input.get(num)+1);
                }
            }
        }

    }

    static void backTraking(int depth, String now){
        if(depth==M){
            sb.append(now).append("\n");
        }
        else{
            int lastUsed = -1;
            for(int i = 0; i<N;i++){
                if(lastUsed!=array[i]&&!visited[i]){
                    String next;
                    if(depth==0){
                        next = ""+array[i];
                    }else{
                        next = now+" "+array[i];
                    }
                    visited[i] = true;
                    backTraking(depth+1,next);
                    visited[i] = false;
                    lastUsed = array[i];
                }
            }
        }
    }
}
