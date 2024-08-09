package basic.star;

/*
*****
****
***
**
*
*/
public class Star3 implements StarInterface{
    @Override
    public void StarPrint() {
        for(int i = 0 ;i<5;i++){
            for(int j = 0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
