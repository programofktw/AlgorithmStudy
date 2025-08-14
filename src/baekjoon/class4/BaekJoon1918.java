package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon1918 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = br.readLine();

        String[] token = input.split("");

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();


        for(int i = 0 ; i < token.length;i++){
            char now = token[i].charAt(0);
            if(Operation.isOperation(now)){
                if(now==')'){
                    Character pop=stack.pop();
                    while(!(pop=='(')){
                        sb.append(pop);
                    }
                }
                else{
                    stack.push(now);
                }
            }else{
                sb.append(now);
            }
        }




        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        System.out.print(sb);
    }


    private static class Operation{
        static Map<Character, Integer> operationLevel = new HashMap<>();

        static {
            operationLevel.put('+',1);
            operationLevel.put('-',1);
            operationLevel.put('*',2);
            operationLevel.put('/',2);
            operationLevel.put('(',3);
            operationLevel.put(')',3);
        }

        public static boolean isOperation(char ch){
            return operationLevel.containsKey(ch);
        }

        public static boolean isOrder(char a, char b){
            return operationLevel.get(a) < operationLevel.get(b);
        }
    }
}
