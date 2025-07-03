package baekjoon.class3;
import java.io.*;
import java.util.*;

public class BaekJoon7662 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            dualPriorityQueue();
        }
        System.out.print(sb);
    }

    private static void dualPriorityQueue() throws IOException {
        int commandNum = Integer.parseInt(br.readLine());
        DualPriorityQueue dpq = new DualPriorityQueue();

        for (int i = 0; i < commandNum; i++) {
            String[] input = br.readLine().split(" ");
            char command = input[0].charAt(0);
            long num = Long.parseLong(input[1]);

            if (command == 'I') {
                dpq.add(num);
            } else {
                if (dpq.isEmpty()) continue;
                if (num == -1) {
                    dpq.smallPoll();
                } else {
                    dpq.bigPoll();
                }
            }
        }
        dpq.printQueue(sb);
    }
}

class DualPriorityQueue {
    private final TreeMap<Long, Integer> queue = new TreeMap<>();

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void add(Long input) {
        queue.put(input, queue.getOrDefault(input, 0) + 1);
    }

    public void bigPoll() {
        if (queue.isEmpty()) return;
        long maxKey = queue.lastKey();
        removeKey(maxKey);
    }

    public void smallPoll() {
        if (queue.isEmpty()) return;
        long minKey = queue.firstKey();
        removeKey(minKey);
    }

    private void removeKey(long key) {
        if (!queue.containsKey(key)) return;
        int count = queue.get(key);
        if (count == 1) queue.remove(key);
        else queue.put(key, count - 1);
    }

    public void printQueue(StringBuilder sb) {
        if (queue.isEmpty()) {
            sb.append("EMPTY\n");
            return;
        }
        sb.append(queue.lastKey()).append(" ").append(queue.firstKey()).append("\n");
    }
}