package baekjoon.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon1350 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int fileNum = scan.nextInt();
        String[] file = new String[fileNum];
        for(int i = 0 ; i<fileNum;i++){
            file[i] = scan.next();
        }
        String clusterSize = scan.next();
        BigInteger clusterNum=BigInteger.valueOf(0);
        for(int i = 0 ; i < fileNum;i++){
           clusterNum = clusterNum.add(BigInteger.valueOf((long)Math.ceil(Double.parseDouble(file[i])/Double.parseDouble(clusterSize))));
        }
        System.out.print(BigInteger.valueOf(Long.parseLong(clusterSize)).multiply(clusterNum));
    }
}
