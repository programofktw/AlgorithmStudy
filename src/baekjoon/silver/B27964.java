package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class B27964 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        String[] inputs = br.readLine().split(" ");

        Set<String> cheeses = new HashSet<>();

        for(String cheese : inputs){
            if(cheese.endsWith("Cheese")){
                cheeses.add(cheese);
            }
        }

        if(cheeses.size()>=4){
            sb.append("yummy");
        }else{
            sb.append("sad");
        }


        System.out.print(sb);
    }

}
