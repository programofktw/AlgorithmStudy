package baekjoon.class1;
import java.util.Scanner;

public class BaekJoon1330 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		String result = bigu(a,b);

		System.out.println(result);
	}
	
	
	public static String bigu(int a, int b) {
		if(a>b) return ">";
		else if(a<b) return "<";
		
		return "==";
	}

}
