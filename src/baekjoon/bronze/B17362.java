package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17362 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine());

        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2};

        int idx = (int)((n - 1) % 8);
        System.out.println(arr[idx]);
    }

}
