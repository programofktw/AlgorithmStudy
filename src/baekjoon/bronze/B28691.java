package baekjoon.bronze;

import java.util.Scanner;

public class B28691 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String result = "";

        switch (s) {
            case "M":
                result = "MatKor";
                break;
            case "W":
                result = "WiCys";
                break;
            case "C":
                result = "CyKor";
                break;
            case "A":
                result = "AlKor";
                break;
            case "$":
                result = "$clear";
                break;
        }

        System.out.print(result);
    }

}
