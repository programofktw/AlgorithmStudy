package baekjoon.class3;


import java.util.Scanner;
import java.io.*;


public class BaekJoon11279 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		Link head = new Link(0);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++) {
			long input = Integer.parseInt(bf.readLine());
			if(input==0) {
				if(head.next==null) {
					sb.append(0).append("\n");
				}
				else {

					sb.append(head.next.a).append("\n");
					head.next = head.next.next;
				}
			}
			else {
				if(head.next==null) {
					head.setNext(new Link(input));
				}
				else {
					Link now = head;
					while(now.next!=null) {
						//해당 자리의 input이 들어가야함
						if(now.next.a<input) {
							Link temp = now.next;
							now.setNext(new Link(input)); 
							now.next.setNext(temp); 
							break;
						}
						else {
							now = now.next;
						}
					}
					if(now.next==null) {
						now.setNext(new Link(input));
					}
				}
			}
		}

		System.out.print(sb);
	}
	
	
	static class  Link{
		static int size = 0;
		long a;
		Link next;
		public Link(long a) {
			this.a = a;
		}
		
		public void setNext(Link link) {
			next = link;
		}
	}
}


