package baekjoon.bronze;
import java.util.*;

public class BaekJoon10807{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        
        int[] num = new int[N];
        
        for(int i = 0 ; i<N;i++){
            num[i] = scan.nextInt();
        }
        
        int v = scan.nextInt();
        int count = 0;
        for(int i = 0; i<N;i++){
            if(num[i]==v){
                count++;
            }
        }
        
        System.out.println(count);
    }
}