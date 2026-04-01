package baekjoon.bronze;

import java.awt.SystemTray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B27389 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double input = scan.nextDouble();

        sb.append(String.format("%.2f",input/4));

        System.out.print(sb);
    }

}
