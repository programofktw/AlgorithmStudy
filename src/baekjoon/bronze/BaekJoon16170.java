package baekjoon.bronze;


import java.util.Calendar;

public class BaekJoon16170 {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();

        int Year = calendar.get(Calendar.YEAR);

        int month = calendar.get(Calendar.MONTH);

        int day = calendar.get(Calendar.DATE);

        System.out.println(Year+"\n"+(month+1)+"\n"+day);

    }
}
