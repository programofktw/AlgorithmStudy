package basic.practice;

import java.util.Scanner;

public class problem3_1 {
    static int N;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        int[] array = new int[3];


        array[0] = 1;
        array[1] = 1;
        array[2] = 2;
        for(int i =3;i<=N;i++){
            int temp = array[0] + array[1] + array[2];
            array[0] = array[1];
            array[1] = array[2];
            array[2] = temp;
        }

//        for(int i = 1;i<=3;i++){
//           if(N>=i) count +=dfs(i,""+i);
//        }


        System.out.print(array[2]);
    }


    public static int dfs(int now, String hap){
        int count = 0;
        if(now>N) return 0;
        else if(now ==N){
            System.out.println(hap);
            return 1;
        }
        for(int i =1;i<=3;i++){
            if(N>=now+i) count +=dfs(now+i,hap +" + "+ i);
        }

        return count;
    }
}
