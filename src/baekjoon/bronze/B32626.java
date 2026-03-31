package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B32626 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        long[][] inputs = new long[3][2];

        for(int i = 0 ; i < 3;i++){

            long[] input = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

            for(int j=0;j<2;j++){
                inputs[i][j] = input[j];
            }
        }

        long Sx = inputs[0][0];
        long Sy = inputs[0][1];
        long Ex = inputs[1][0], Ey = inputs[1][1];
        long Px = inputs[2][0], Py = inputs[2][1];

// 1. 같은 x (세로)
        if (Sx == Ex) {
            if (Px == Sx && Math.min(Sy, Ey) < Py && Py < Math.max(Sy, Ey)) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }

// 2. 같은 y (가로)
        else if (Sy == Ey) {
            if (Py == Sy && Math.min(Sx, Ex) < Px && Px < Math.max(Sx, Ex)) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }

// 3. 꺾는 경우
        else {
            // 경로1: 가로 → 세로
            boolean path1 = true;
            if (Py == Sy && Math.min(Sx, Ex) < Px && Px < Math.max(Sx, Ex)) path1 = false;
            if (Px == Ex && Math.min(Sy, Ey) < Py && Py < Math.max(Sy, Ey)) path1 = false;

            // 경로2: 세로 → 가로
            boolean path2 = true;
            if (Px == Sx && Math.min(Sy, Ey) < Py && Py < Math.max(Sy, Ey)) path2 = false;
            if (Py == Ey && Math.min(Sx, Ex) < Px && Px < Math.max(Sx, Ex)) path2 = false;

            if (path1 || path2) System.out.println(1);
            else System.out.println(2);
        }
    }


}
