package baekjoon.bronze;


import java.util.Scanner;

public class BaekJoon26489 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int count = 0;
        while(scan.hasNext()){
            scan.nextLine();
            count++;
        }

        System.out.print(count);
    }
}
