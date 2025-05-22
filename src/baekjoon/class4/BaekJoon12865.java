package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon12865 {
    static ArrayList<Node> list = new ArrayList<>();

    static int K;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

        N  = Integer.parseInt(st.nextToken());
        K  = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i<N;i++){
            st = new StringTokenizer(br.readLine());

            int weight = Integer.parseInt(st.nextToken());

            int value = Integer.parseInt(st.nextToken());

            list.add(new Node(weight,value));
        }

        int contain = backTraking(1,list.get(0).weight,list.get(0).value);

        int notContain = backTraking(1,0,0);


        System.out.print(Math.max(contain,notContain));
    }

    static int backTraking(int index,int weight,int value){

        if(weight > K){
            return 0;
        }
        if(index==N) return value;

        int contain = backTraking(index+1,weight+list.get(index).weight,value+list.get(index).value);

        int notContain = backTraking(index+1, weight,value);


        return Math.max(contain,notContain);
    }

    private static class Node{
        int weight;
        int value;

        Node(int weight, int value){
            this.weight = weight;
            this.value = value;
        }
    }


}
