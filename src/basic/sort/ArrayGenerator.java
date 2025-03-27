package basic.sort;

public class ArrayGenerator {

    public static void initArray(int[] array){
        for(int i=0; i< array.length;i++){
            array[i] = (int)(Math.random()*1000)+1;
        }
    }

}
