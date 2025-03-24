package basic.sort;

import java.util.Scanner;

public class SortMain {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        Sort sort = new Select();

        int[] array;

        System.out.print("몇 개의 임시 값을 생성하시겠습니까? ");

        int N = scan.nextInt();

        array = new int[N];

        ArrayGenerator.initArray(array);

        sort.printAllArray(array,-1);

        sort.sort(array);

    }
}
