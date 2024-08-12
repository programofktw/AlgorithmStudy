package basic.star;

import java.util.Scanner;
/*
*******
 *****
  ***
   *
 */
public class Star6 implements StarInterface{

    @Override
    public void StarPrint() {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int W = 2 * H-1;
        int mid = W/2;

        for(int i = H-1; i>=0;i--){
            for(int j = 0 ; j<W;j++){
                if(mid-i<=j&&mid+i>=j) System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
