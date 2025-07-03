package baekjoon.class3;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.*;


public class BaekJoon11279 {
	private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();


		int commandNum = Integer.parseInt(bf.readLine());

		for(int i=0;i<commandNum;i++){
			int command = Integer.parseInt(bf.readLine());

			if(command == 0){
				if(maxHeap.isEmpty()){
					sb.append(0).append(System.lineSeparator());
				}else{
					sb.append(maxHeap.poll()).append(System.lineSeparator());
				}
			}else{
				maxHeap.add(command);
			}
		}

		System.out.print(sb);

	}
}


