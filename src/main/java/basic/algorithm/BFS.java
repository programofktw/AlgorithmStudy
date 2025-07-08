package basic.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
    public static int[] field = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

    public static void printAsBinaryTree() {
        int n = field.length;
        int height = (int) Math.ceil(Math.log(n + 1) / Math.log(2)); // 트리 높이
        int maxNodeWidth = getMaxWidth(field); // 가장 긴 숫자의 자리수
        int maxWidth = (int) Math.pow(2, height) * (maxNodeWidth + 2); // 총 가로 폭 (간격 포함)

        int index = 0;

        for (int level = 0; level < height; level++) {
            int levelNodeCount = (int) Math.pow(2, level);
            int spaceBetween = maxWidth / levelNodeCount; // 노드 사이 간격

            // 시작 여백
            System.out.print(" ".repeat(spaceBetween / 2 - maxNodeWidth / 2));

            for (int i = 0; i < levelNodeCount && index < n; i++) {
                String formatted = String.format("%" + maxNodeWidth + "d", field[index++]);
                System.out.print(formatted);

                // 간격
                if (i != levelNodeCount - 1) {
                    System.out.print(" ".repeat(spaceBetween - maxNodeWidth));
                }
            }

            System.out.println();
        }
    }

    // 숫자 중 가장 긴 자리수 계산
    private static int getMaxWidth(int[] arr) {
        int maxLen = 0;
        for (int num : arr) {
            int len = String.valueOf(num).length();
            if (len > maxLen) maxLen = len;
        }
        return maxLen;
    }

    public static void main(String[] args){
        printAsBinaryTree();
        System.out.print("BFS : ");
        bfs();
    }

    private static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while(!queue.isEmpty()){
            int parent = queue.poll();
            System.out.print(parent+" -> ");
            int left = parent*2+1;
            int right = parent*2+2;

            if(left>=field.length) continue;
            else if(right>=field.length) queue.add(left);
            else{
                queue.add(left);
                queue.add(right);
            }
        }

    }

}
