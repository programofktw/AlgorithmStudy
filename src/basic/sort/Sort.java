package basic.sort;

public interface Sort {

    void sort(int[] array);


    default void swap(int[] array, int i, int j){
        int temp = array[i];

        array[i] = array[j];

        array[j] = temp;
    }

    default void printAllArray(int[] array, int num){
        StringBuilder sb = new StringBuilder();
        if(num == -1 ){
            sb.append("Start\t : ");
        }else{
            sb.append("Case ").append(num).append("\t : ");
        }
        for(int i : array){
            sb.append(String.format("%4d",i)).append(" ");
        }

        System.out.println(sb);
    }

}
