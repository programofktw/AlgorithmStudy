package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface BaekJoon11725 {


    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int node = Integer.parseInt(br.readLine());

        int[] parentList = new int[node+1];

        for(int i=1;i<node;i++){
            String[] line = br.readLine().split(" ");

            int parent = Integer.parseInt(line[0]);

            int child = Integer.parseInt(line[1]);

            parentList[child] = parent;
        }

        for(int i = 2;i<=node;i++){
            System.out.println(parentList[i]);
        }
    }
}
