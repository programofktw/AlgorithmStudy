package baekjoon.silver;

import java.util.Scanner;

public class BaekJoon1193 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);




        long request = scan.nextLong();

        long sum=1;
        long term=1;
        //true  아래서위 //false 위에서 아래
        boolean bang = true;

        while(sum < request){
            term++;
            bang = !bang;
            sum+=term;
        }

        //분자
        long a;
        //분모
        long b;
        //아래서 위
        a=term;
        b=1;

        for(long i = sum-term+1;i<request;i++){
              a--;
              b++;
        }

        if(!bang){
            long temp = a;
            a = b;
            b= temp;
        }
        System.out.println(a+"/"+b);

    }
}
