package basic.baaarking;


import java.util.Scanner;

/*
배열을 입력 받았을 때
해당 배열에서 합이 100이 되는 2개의 숫자가 있는지 확인하는 문제
입력은 1 <= input <= 100의 범위로 이루어지며
한 줄에 공백으로 나뉘어 존재(ex 1 2 3 100)

기존 모든 배열의 값을 비교하는 O(N^2) 보다 짧은 O(N) 만에 문제가 해결
 */
public class sum100 {
    public static void main(String[] args){
       Scanner scan =new Scanner(System.in);

       int[] arr = new int[101];

       String input = scan.nextLine();

       String[] num = input.split(" ");

       int result=0;
        for(String a :num){
            if(arr[100-Integer.parseInt(a)]==1){
                result = 1;
            }
            arr[Integer.parseInt(a)] =1;
        }

        System.out.print(result);
        scan.close();
    }
}
