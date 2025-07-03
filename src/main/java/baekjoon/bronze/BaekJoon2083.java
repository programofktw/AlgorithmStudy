package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon2083 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            String name = scan.next();
            int age = scan.nextInt();
            int weight = scan.nextInt();

            if(name.equals("#")) break;
            if(age > 17 || weight >=80){
                System.out.println(name +" Senior");
            }else{
                System.out.println(name + " Junior");
            }
        }
    }
}
