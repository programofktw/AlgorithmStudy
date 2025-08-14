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

        char[] token = input.toCharArray();

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();


        for (char now : token) {
            if (Operation.isOperation(now)) {
                if (now == '(') stack.push(now);
                else if (now == ')') {
                    Character pop = stack.pop();
                    while (!(pop == '(')) {
                        sb.append(pop);
                        pop = stack.pop();
                    }
                } else {
                    if (stack.empty())
                        stack.push(now);
                    else {
                        while (!stack.empty() && Operation.isOrder(now, stack.peek())) {
                            sb.append(stack.pop());
                        }
                        stack.push(now);
                    }
                }
            } else {
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
            operationLevel.put('(',0);
            operationLevel.put(')',0);
        }

        public static boolean isOperation(char ch){
            return operationLevel.containsKey(ch);
        }

        public static boolean isOrder(char a, char b){
            return operationLevel.get(a) <= operationLevel.get(b);
        }
    }
}
