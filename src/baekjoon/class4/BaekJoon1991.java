package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BaekJoon1991 {

    static Map<Character, Child> tree = new HashMap<>();

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());


        //입력부
        for(int i = 0 ; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            char parent = st.nextToken().charAt(0);

            char left = st.nextToken().charAt(0);

            char right = st.nextToken().charAt(0);

            Child child = new Child();
            child.right = (right!='.')?right:null;
            child.left = (left!='.')?left:null;

            tree.put(parent,child);

        }
        preOrder('A');
        sb.append("\n");
        inOrder('A');
        sb.append("\n");
        postOrder('A');
        System.out.print(sb);
    }

    //전위 순회
    static void preOrder (char now){

        Child child = tree.get(now);

        sb.append(now);
        if(child.left!=null) preOrder(child.left);
        if(child.right!=null) preOrder(child.right);

    }

    //중위 순회
    static void inOrder(Character now) {
        if(now==null) return;

        Child child = tree.get(now);
        inOrder(child.left);
        sb.append(now);
        inOrder(child.right);
    }


    //후위 순회
    static void postOrder(Character now){
        if(now == null) return;
        Child child = tree.get(now);
        postOrder(child.left);
        postOrder(child.right);
        sb.append(now);
    }


    private static class Child{
        Character left;
        Character right;
    }

}
