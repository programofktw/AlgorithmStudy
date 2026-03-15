package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class B18868 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] spaces = new int[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                spaces[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){

            int[] arr = spaces[i].clone();
            int[] sorted = arr.clone();
            Arrays.sort(sorted);

            HashMap<Integer,Integer> rank = new HashMap<>();

            int r=0;
            for(int v : sorted){
                if(!rank.containsKey(v)){
                    rank.put(v,r++);
                }
            }

            StringBuilder sb = new StringBuilder();

            for(int j=0;j<m;j++){
                sb.append(rank.get(arr[j])).append(",");
            }

            String key = sb.toString();
            map.put(key,map.getOrDefault(key,0)+1);
        }

        int result = 0;

        for(int v : map.values()){
            result += v*(v-1)/2;
        }

        System.out.println(result);
    }
}
