package basic.jolup;


import java.util.Scanner;
public class perfactnum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k  = scan.nextInt();

        int now =2;
        int count = 0;

        while(true){
            int sum = 0;
            for(int i =1;i<=now;i++){
                if(now%i==0) sum+= i;
            }
            if(sum == 2*now) count++;
            if(count==k) break;
            now++;
        }
        System.out.println(now);
    }
}
