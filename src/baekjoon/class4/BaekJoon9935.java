package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon9935 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String text = br.readLine();

        String boomText = br.readLine();


        Stack<Character> stack = new Stack<>();

        A : for(char now :  text.toCharArray()){
            if(now==boomText.charAt(boomText.length()-1)){
                Stack<Character> transaction = new Stack<>();
                for(int i = boomText.length()-2; i>=0;i--){
                    if(stack.isEmpty()){
                        rollback(stack, transaction);
                        stack.push(now);
                        continue A;
                    }
                    char stackPop = stack.pop();
                    transaction.push(stackPop);
                    if(boomText.charAt(i)!=stackPop){
                        rollback(stack,transaction);
                        stack.push(now);
                        continue A;
                    }
                }
            }else{
                stack.push(now);
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();

        System.out.println(sb.toString().isEmpty()?"FRULA":sb);
    }

    private static void rollback(Stack<Character> stack, Stack<Character> transaction) {
        while(!transaction.isEmpty()){
            stack.push(transaction.pop());
        }
    }
}
