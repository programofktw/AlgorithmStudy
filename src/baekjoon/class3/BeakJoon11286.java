package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BeakJoon11286 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static StringBuilder sb = new StringBuilder();
    public static PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
        Integer positiveO1 = (o1>=0)?o1:(o1*-1);
        Integer positiveO2 = (o2>=0)?o2:(o2*-1);

        if(o1.equals(o2)) return 0;
        else if(positiveO1>positiveO2) return 1;
        else if(positiveO1.equals(positiveO2)&&o1>o2) return 1;
        else return -1;
    });


    public static void main(String[] args) throws IOException {
        int testCaseNum = Integer.parseInt(br.readLine());

        for(int i=0;i<testCaseNum;i++){
            int command = Integer.parseInt(br.readLine());

            if(command ==0){
                if(pq.isEmpty()) sb.append(0).append("\n");
                else sb.append(pq.poll()).append("\n");
            }else{
                pq.add(command);
            }
        }

        System.out.print(sb);
    }
}
