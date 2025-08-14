package basic.algorithm;

public class AbstractTreeAlogorithm {

    public static int[] field = {0,1,2,3,4,5,6,7,8,9,10};

    public static void printAsBinaryTree() {
        int n = field.length;
        int height = (int) Math.ceil(Math.log(n + 1) / Math.log(2)); // 트리 높이
        int maxNodeWidth = getMaxWidth(field); // 가장 긴 숫자의 자리수
        int maxWidth = (int) Math.pow(2, height) * (maxNodeWidth + 2); // 총 가로 폭 (간격 포함)

        int index = 0;

        for (int level = 0; level < height; level++) {
            int levelNodeCount = (int) Math.pow(2, level);
            int spaceBetween = maxWidth / levelNodeCount; // 노드 사이 간격

            // 시작 여백
            System.out.print(" ".repeat(spaceBetween / 2 - maxNodeWidth / 2));

            for (int i = 0; i < levelNodeCount && index < n; i++) {
                String formatted = String.format("%" + maxNodeWidth + "d", field[index++]);
                System.out.print(formatted);

                // 간격
                if (i != levelNodeCount - 1) {
                    System.out.print(" ".repeat(spaceBetween - maxNodeWidth));
                }
            }

            System.out.println();
        }
    }

    // 숫자 중 가장 긴 자리수 계산
    private static int getMaxWidth(int[] arr) {
        int maxLen = 0;
        for (int num : arr) {
            int len = String.valueOf(num).length();
            if (len > maxLen) maxLen = len;
        }
        return maxLen;
    }
}
