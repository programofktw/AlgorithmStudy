package baekjoon.class2;

import java.math.*;
import java.io.*;

public class BaekJoon1929  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		for (int i = a; i <= b; i++) {
			if (i == 1)
				continue;
			if (prime(i)) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
	
	static boolean prime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
