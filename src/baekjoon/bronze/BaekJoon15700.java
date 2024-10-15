package baekjoon.bronze;
public class BaekJoon15700 {
    public static void main(String[] args){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        System.out.print((w/2 *h) + (h/2 * ((w%2==0)?0:1)));
    }
}
