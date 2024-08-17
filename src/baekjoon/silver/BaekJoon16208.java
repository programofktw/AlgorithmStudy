package baekjoon.silver;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BaekJoon16208 {
    static long[] needStick;

    static BigInteger result= BigInteger.ZERO;
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine().trim());

        needStick = new long[N];

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int i =0 ;

        while(st.hasMoreTokens()){
            needStick[i++] = Integer.parseInt(st.nextToken());
        }

        DAQ(0,needStick.length-1);

        System.out.println(result);
    }

    public static BigInteger DAQ(int start, int end){
        if(start == end) return BigInteger.valueOf(needStick[start]);
        else{
            int mid = (start + end) /2;
            BigInteger front = DAQ(start,mid);
            BigInteger back = DAQ(mid+1,end);
            result = result.add(front.multiply(back));
            return front.add(back);
        }
    }
}
