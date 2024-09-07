package basic.star;

import java.util.Scanner;
/*
****
*  *
*  *
****
* */
public class Star8 implements StarInterface{
    @Override
    public void StarPrint() {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();


        for(int i=0;i<h;i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1;i<h-1;i++){
            System.out.print("*");
            for(int j=0;j<h-2;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for(int i=0;i<h;i++){
            System.out.print("*");
        }
    }



}
