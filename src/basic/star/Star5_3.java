package basic.star;

import java.util.Scanner;

/*
  *
 * *
*****
 */
public class Star5_3 implements StarInterface{
    public static Scanner scan = new Scanner(System.in);
    @Override
    public void StarPrint() {
        int size = scan.nextInt();
        int star=1;
        int brank = size-1;
        int brank2=1;

        for(int i= 0; i< brank;i++){
            System.out.print(" ");
        }
        System.out.println("*");
        star+=2;
        brank--;
        for(int i = 0 ; i <size-2;i++){

            for(int j = 0; j<brank;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0;j<brank2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
            star+=2;
            brank--;
            brank2+=2;
        }

        for(int i = 0 ; i<star;i++){
            System.out.print("*");
        }
    }
}
