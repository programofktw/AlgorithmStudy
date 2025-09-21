package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon28702 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String[] input = new String[3];

        input[0] = br.readLine();

        input[1] = br.readLine();

        input[2] = br.readLine();

        int goal=0;

        for(int i = 0; i<3;i++){
            if(input[i].equals("FizzBuzz")||input[i].equals("Fizz")||input[i].equals("Buzz")) continue;
            else{
                int num = Integer.parseInt(input[i]);
                goal = num + (3-i);
                break;
            }
        }

        if((goal%3)==0&&goal%5==0) System.out.println("FizzBuzz");
        else if(goal%3==0) System.out.println("Fizz");
        else if(goal%5==0) System.out.println("Buzz");

        else System.out.print(goal);


    }
}
