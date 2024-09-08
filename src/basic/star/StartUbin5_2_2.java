package basic.star;

public class StartUbin5_2_2 implements StarInterface{
    @Override
    public void StarPrint() {
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        int a=4;
        for(int i=0; i<a; i++){

            for(int j=a; j>0; j--){
                if(j==i+1||i==a-1)          //before if(j<=i+1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }

            for(int j=0; j<i; j++){
                if(j==i-1||i==a-1)          //before   System.out.printf("*");
                    System.out.printf("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
