package baekjoon.bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B31403 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int aI = Integer.parseInt(a);
        int bI = Integer.parseInt(b);
        int cI = Integer.parseInt(c);

        sb.append(aI+bI-cI).append("\n");
        sb.append(Integer.parseInt(a+b)-cI);

        System.out.print(sb);
    }


}
