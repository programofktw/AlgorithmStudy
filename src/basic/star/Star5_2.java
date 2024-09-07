package basic.star;

/*
    *
   ***
  *****
 *******
 */
public class Star5_2 implements StarInterface{


    @Override
    public void StarPrint() {
        int size = 5;
        int star=1;
        int brank = 4;
        for(int i = 0 ; i <5;i++){
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
