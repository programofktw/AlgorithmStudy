package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon10989{
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
	
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++){
			sb.append(arr[i]).append('\n');
		}

        Arrays.sort(arr);
        
        System.out.println(sb);
        
    }
}