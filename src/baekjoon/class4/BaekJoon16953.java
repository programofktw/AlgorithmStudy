package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon16953 {

    static long B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        solved(A);
    }

    public static void solved(long now){

        int result;

        int result1 = backTraking(now*10+1,1);
        int result2 = backTraking(now*2,1);

        if(result1 == -1&&result2==-1) result= -1;
        else if(result1==-1)result = result2;
        else if(result2==-1) result = result1;
        else result = Math.min(result2,result1);

        System.out.print((result!=-1)?result+1:-1);

    }

    public static int backTraking(long now,int depth){
        if(now > B){
            return -1;
        }
        if(now == B) return depth;
        int result;

        int result1 = backTraking(now*10+1,depth+1);
        int result2 = backTraking(now*2,depth+1);

        if(result1 == -1&&result2==-1) result= -1;
        else if(result1==-1)result = result2;
        else if(result2==-1) result = result1;
        else result = Math.min(result2,result1);

        return result;
    }
}
