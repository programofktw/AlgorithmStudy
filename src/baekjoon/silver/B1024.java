package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1024 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        long[] inputs = Arrays.stream(br.readLine().split(" "))
            .mapToLong(Long::parseLong)
            .toArray();

        long N = inputs[0];
        long L = inputs[1];

        for (long k = L; k <= 100; k++) {

            long temp = N - (k * (k - 1) / 2);

            if (temp < 0) break;

            if (temp % k == 0) {
                long x = temp / k;

                if (x >= 0) {
                    for (long i = 0; i < k; i++) {
                        sb.append(x + i).append(" ");
                    }
                    System.out.print(sb);
                    return;
                }
            }
        }

        System.out.print(-1);
    }
}