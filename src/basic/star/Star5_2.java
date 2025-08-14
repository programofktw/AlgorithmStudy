package basic.star;


import java.util.Scanner;
/*
    *
   ***
  *****
 *******
 */
public class Star5_2 implements StarInterface{
    public static Scanner scan = new Scanner(System.in);

    @Override
    public void StarPrint() {
        int size = scan.nextInt();
        int star=1;
        int brank = size-1;
        for(int i = 0 ; i <size;i++){
            for(int j = 0; j<brank;j++){
                System.out.print(" ");
            }
            for(int j =0 ;j<star;j++){
                System.out.print("*");
            }
            for(int j = 0; j<brank;j++){
                System.out.print(" ");
            }
            System.out.println();
            star+=2;
            brank--;
        }
    }
}
