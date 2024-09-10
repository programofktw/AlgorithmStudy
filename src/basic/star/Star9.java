package basic.star;

import java.util.Scanner;

public class Star9 implements StarInterface{
    static Scanner scan = new Scanner(System.in);

    @Override
    public void StarPrint() {
        int size = scan.nextInt();

        int w = scan.nextInt();

        int h = scan.nextInt();

        int width = size*w+2*(w-1);

        int heigh = size*h+2*(h-1);


       // 0 1 2 3 4 012는 출력 3 4는 블랭크
        // size는 3
        int onec = size+2;
        for(int i=0;i<heigh;i++){
            if(i%(onec)==size||i%(onec)==size+1) System.out.println("X");
            else{
                for(int j = 0 ; j <width;j++){
                    if(j%(onec)==size||j%(onec)==size+1) System.out.print("X");
                    else System.out.print("O");
                }
                System.out.println();
            }
        }
    }
}
