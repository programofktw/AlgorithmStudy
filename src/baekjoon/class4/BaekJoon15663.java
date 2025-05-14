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
    static boolean[] visited;

    static Map<Integer, Integer> input= new HashMap<>();
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

        for(int num : array){
            if(input.containsKey(num)){
                input.put(num,input.get(num)+1);
            }else{
                input.put(num,1);
            }
        }

        for(int num : input.keySet()){
            input.put(num,input.get(num)-1);
            dfs(1,num+"");
            input.put(num,input.get(num)+1);
        }
    }

    static void dfs(int depth, String now){
        if(depth==M) System.out.println(now);

        else{
            for(int num : input.keySet()){
                if(input.get(num)>0){
                    input.put(num,input.get(num)-1);
                    dfs(depth+1,now+" "+num);
                    input.put(num,input.get(num)+1);
                }
            }
        }

    }
}
