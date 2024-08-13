package basic.star;


import java.util.Scanner;

/*
    *
   ***
  *****
 *******
  *****
   ***
    *
 */
public class Star7 implements StarInterface{
    @Override
    public void StarPrint() {
        Scanner scan = new Scanner(System.in);

        int H;
        int re =0;
        do{
            if(re==0) System.out.println("홀수를 입력해주십시요.");
            else System.out.println("짝수를 입력하셨습니다.");
            H = scan.nextInt();
            re++;
        }while(H%2==0);

        int HMid = H/2;

        int W = H;

        int WMid = W/2;

        int star = 0;
        for(int i = 0 ; i<H;i++){
            for(int j = 0; j<W;j++){
                if(WMid-star<=j&&WMid+star>=j) System.out.print("*");
                else System.out.print(" ");

            }

            if(i<HMid) star++;
            else star--;
            System.out.println();
        }


    }
}
