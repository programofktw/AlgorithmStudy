package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon12595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        Map<Long, Integer> guestCheck;
        for(int i = 0 ; i<T;i++){
            int G = Integer.parseInt(br.readLine());

            guestCheck = new HashMap<>();

            long[] guests = Arrays.stream((br.readLine().split(" "))).mapToLong(Long::parseLong).toArray();

            for(long guest : guests){
                if(guestCheck.containsKey(guest)){
                    guestCheck.remove(guest);
                }else{
                    guestCheck.put(guest,1);
                }
            }

            long alone = (long) guestCheck.keySet().toArray()[0];

            sb.append("Case #").append(i+1).append(": ").append(alone).append("\n");
        }

        System.out.print(sb);
    }
}
