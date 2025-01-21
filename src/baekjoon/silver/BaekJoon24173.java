package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon24173 {
    static int count =0;
    static int K ;
    static boolean hasSwap=false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        long[] input = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Long.parseLong(st.nextToken());
        }

        heapSort(input,K);
        if(!hasSwap)System.out.print(-1);
    }

    public static void heapSort(long[] A,int K) {
        int n = A.length;

        buildMinHeap(A, n);
        for (int i = n - 1; i > 0; i--) {
            swap(A, 0, i);  // 루트와 마지막 원소 교환

            heapify(A, 0, i);  // 힙 크기 줄이고 힙 성질 복원
        }
    }

    public static void buildMinHeap(long[] A, int n) {
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(A, i, n);
        }
    }

    public static void heapify(long[] A, int k, int n) {
        int left = 2 * k + 1;
        int right = 2 * k + 2;
        int smaller = k;

        if (left < n && A[left] < A[smaller]) {
            smaller = left;
        }
        if (right < n && A[right] < A[smaller]) {
            smaller = right;
        }

        if (smaller != k) {
            swap(A, k, smaller);
            heapify(A, smaller, n);
        }
    }

    public static void swap(long[] A, int i, int j) {
        count++;

        long temp = A[i];
        A[i] = A[j];
        A[j] = temp;

        if(count==K){

            System.out.print(Math.min(A[i],A[j])+" "+Math.max(A[i],A[j]));
            hasSwap=true;
        }

    }
}