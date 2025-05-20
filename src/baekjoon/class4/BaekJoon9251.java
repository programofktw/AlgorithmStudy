package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9251 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();

        String second = br.readLine();


        solved(first,second);

    }

    static void solved(String first, String second){

        int result =0;
        for(int i = 0; i<first.length();i++){
            char start = first.charAt(i);

            for(int j = 0 ; j<second.length();j++){
                if(second.charAt(j) == start){
                    result = Math.max(backTraking(first,second,i,j)+1,result) ;
                }
            }
        }

        System.out.println(result);
    }

    static int backTraking(String first, String second, int firstIndex, int secondIndex){

        for(int i = firstIndex+1;i<first.length();i++){
            char start = first.charAt(i);
            for(int j = secondIndex+1;j<second.length();j++){
                if(second.charAt(j)==start){
                    return backTraking(first,second,i,j)+1;
                }
            }
        }

        return 0;
    }

}
