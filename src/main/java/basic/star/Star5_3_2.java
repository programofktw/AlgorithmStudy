package basic.star;

import java.util.Scanner;
/*
   *
  * *
 *****
 */
public class Star5_3_2 implements StarInterface{
    public static Scanner scan = new Scanner(System.in);

    @Override
    public void StarPrint() {
        int size = scan.nextInt();

        int star=0;
        int mid = size-1;
        for(int i= 0 ;i<size;i++){
            for(int j = 0 ; j<size*2-1;j++){
                if(j==mid-star||j==mid+star||i==size-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            star++;
        }
    }
}
