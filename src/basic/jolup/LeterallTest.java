package basic.jolup;

public class LeterallTest {
    public static void main(String[] args){

        String a = "abcd";
        String b  = "abc";
        String c = "d";

        b = b + c;

        String d = a+c;

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(d.equals(a));
        System.out.println(a.length());
    }

}
