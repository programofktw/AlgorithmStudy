package baekjoon.baekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon9494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = Integer.parseInt(scanner.nextLine().trim());
            if (num == 0) {
                return; // 종료
            }

            int roll = 0;

            for (int i = 0; i < num; i++) {
                String line = scanner.nextLine();
                line += " "; // 공백 추가 (파이썬과 동일한 처리)

                // 공백 인덱스 저장
                ArrayList<Integer> spaceIndexes = new ArrayList<>();
                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == ' ') {
                        spaceIndexes.add(j);
                    }
                }

                if (i == 0 && !spaceIndexes.isEmpty()) {
                    roll = spaceIndexes.get(0); // 첫 줄은 첫 단어의 첫 공백 위치
                }

                for (int idx : spaceIndexes) {
                    if (idx >= roll) {
                        roll = idx;
                        break;
                    }
                }
            }

            System.out.println(roll + 1); // 1-based index
        }
    }
}