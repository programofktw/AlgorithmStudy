package basic.practice;

import java.util.Scanner;

public class problem3_1 {
    static int N;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int TestCase = Integer.parseInt(scan.nextLine());


        for(int i = 0 ; i<TestCase;i++){
            N = Integer.parseInt(scan.nextLine());



            int[] array = new int[3];


            array[0] = 1;
            array[1] = 1;
            array[2] = 2;
            if(N<3){
                System.out.println(array[N]);
                continue;
            }

            for(int j =3;j<=N;j++){
                int temp = array[0] + array[1] + array[2];
                array[0] = array[1];
                array[1] = array[2];
                array[2] = temp;
            }


            System.out.println(array[2]);
        }

    }
}
