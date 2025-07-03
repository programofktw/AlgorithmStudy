package baekjoon.baekJoon;

import java.util.Scanner;

public class BaekJoon1152 {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count= 0;
        if(s.equals(" ")){
            
        }
        else{
            s= s.trim();
            for(int i = 0 ; i< s.length();i++){
                if(s.charAt(i) == ' '){
                    count++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
