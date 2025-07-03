package basic.star;


import java.util.Map;
import java.util.Scanner;
/*
   *
  ***
 *****
*******
 */
public class Star5 implements StarInterface{
    @Override
    public void StarPrint() {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = 2*H-1;

        int mid = W/2;
        for(int i = 0; i<H;i++){
            for(int j = 0; j< W; j++){
                if(mid-i<=j&&mid+i>=j) System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            if(i==H-1) continue;
            System.out.println();
        }
    }
}
