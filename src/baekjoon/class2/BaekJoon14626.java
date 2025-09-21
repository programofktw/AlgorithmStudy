package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14626 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = br.readLine();

        String[] split = input.split("");

        int[] num = new int[13];

        int i =0;

        int starIndex=0;
        for(String now : split){
            if(now.equals("*")){
                starIndex= i;
                num[i++] = 0;

                continue;
            }
            num[i++] = Integer.parseInt(now);
        }

        int tempTotal = 0;

        for(int j = 0 ; j < 12;j++){
            if(j%2==0)
               tempTotal += num[j];
            else
                tempTotal += num[j]*3;
        }

        for(int j=0;j<10;j++){
            if(starIndex%2==0){
                if(check(num[12],j, tempTotal)){
                    System.out.print(j);
                    break;
                }
            }else{
                if(check(num[12],j*3, tempTotal)){
                    System.out.print(j);
                    break;
                }
            }
        }


    }

    private static boolean check(int goal,int j, int tempTotal){
        int total = j+tempTotal;

        return (10 - total % 10)%10 == goal;

    }
}
