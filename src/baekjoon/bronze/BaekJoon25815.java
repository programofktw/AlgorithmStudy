package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon25815 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int catYear = Integer.parseInt(st.nextToken());
        int catMonth = Integer.parseInt(st.nextToken());

        int humanY =0;
        int humanM =0;

        int count  = 0;



        //1년 이상인 경우
        while(catYear!=0){
            if(count==0){
                humanY += CatToHuman.FIRST.human;
                catYear--;
                count++;
            }
            else if(count==1){
                humanY += CatToHuman.SECOND.human;
                catYear--;
                count++;
            }
            else if(count==2){
                humanY += catYear * CatToHuman.OVER.human;
                catYear=0;
            }
        }

        if(count==0){
            humanM = catMonth * CatToHuman.FIRST.human;
        }else if(count ==1){
            humanM = catMonth * CatToHuman.SECOND.human;
        }else if(count == 2){
            humanM = catMonth * CatToHuman.OVER.human;
        }
        humanY += humanM / 12;
        humanM = humanM % 12;

        System.out.print(humanY + " " + humanM);

    }


    enum CatToHuman{

        FIRST(1,15),
        SECOND(1, 9),
        OVER(1,4);

        CatToHuman(int cat, int human) {
            this.cat = cat;
            this.human = human;
        }

        final int cat;
        final int human;

    }
}
