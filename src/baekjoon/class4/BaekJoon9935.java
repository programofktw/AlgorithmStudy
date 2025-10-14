package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9935 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String text = br.readLine();

        String boomText = br.readLine();


        int preTextLength;
        do{
            preTextLength = text.length();
            text = text.replaceAll(boomText,"");
            if(text.isEmpty()) break;
        }while(preTextLength!=text.length());

        System.out.println((text.isEmpty())?"FRULA":text);
    }
}
