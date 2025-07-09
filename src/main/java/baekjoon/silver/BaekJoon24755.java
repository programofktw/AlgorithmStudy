package baekjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Election Paradox
 */
public class BaekJoon24755 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] person=init();

        input(person);

        Arrays.sort(person);

        int count = 0;

        int canLose = person.length/2 +1;
        for(int i = canLose;i<person.length;i++){
             count += person[i];
        }

        for(int i = 0 ; i <canLose;i++){
            count += person[i]/2;
        }

        System.out.print(count);

    }

    private static int[] init() throws IOException {

        int town = Integer.parseInt(br.readLine());

        return new int[town];
    }

    private static void input(int[] person) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int i = 0;
        while(st.hasMoreTokens()){
            person[i++] = Integer.parseInt(st.nextToken());
        }
    }
}
