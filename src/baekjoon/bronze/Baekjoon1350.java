package baekjoon.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon1350 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int fileNum = scan.nextInt();
        BigInteger[] file = new BigInteger[fileNum];
        for(int i = 0 ; i<fileNum;i++){
            file[i] = scan.nextBigInteger();
        }
        BigInteger clusterSize = scan.nextBigInteger();
        BigInteger clusterNum=BigInteger.valueOf(0);
        for(int i = 0 ; i < fileNum;i++){
           clusterNum = clusterNum.add(BigInteger.valueOf((long)Math.ceil(Double.parseDouble(file[i].toString())/Double.parseDouble(clusterSize.toString()))));
        }
        System.out.print(clusterSize.multiply(clusterNum));
    }
}
