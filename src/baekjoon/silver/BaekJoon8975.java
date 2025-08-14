package baekjoon.silver;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon8975 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int count =0;
        Set<String> titleSet = new HashSet<>();

        for(int i = 0 ; i<N;i++){
            titleSet.add(scan.next());
        }

        int M = scan.nextInt();

        A:for(int i=0;i<M;i++){
            String s = scan.next();
            if(titleSet.contains(s)){
                count++;
                System.out.println(s+" find!");
                if(count>=((double)N/2)){
                    System.out.println(i+1);
                    break A;
                }
                titleSet.remove(s);
            }
        }
    }
}
