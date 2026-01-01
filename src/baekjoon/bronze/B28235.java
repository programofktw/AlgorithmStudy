package baekjoon.bronze;

import java.util.Scanner;

public class B28235 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String result= "";

        switch (input){
            case "SONGDO" :
                result = "HIGHSCHOOL";
                break;
            case "CODE" :
                result = "MASTER";
                break;
            case "2023" :
                result = "0611";
                break;
            case "ALGORITHM" :
                result = "CONTEST";
                break;
        }

        System.out.print(result);
    }

}
