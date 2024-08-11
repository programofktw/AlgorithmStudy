package baekjoon.silver;
import java.util.Scanner;

public class BaekJoon1094 {
    static int target;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        target = scan.nextInt();

        int stick = 64;
        int result = 0;
        int sum = 0;

        while(stick > target){
            stick/=2;
        }

        sum += stick;
        result++;

        while(stick!=1){
            stick/=2;
            if(sum + stick > target) continue;
            else{
                result++;
                sum+=stick;
            }
        }

        System.out.println(result);
    }




}
