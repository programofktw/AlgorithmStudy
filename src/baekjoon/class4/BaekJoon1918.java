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
        //평범한 식 입력
        String input = br.readLine();
        //식을 한글자씩 나누기
        char[] token = input.toCharArray();
        //연산자를 저장할 Stack 생성
        Stack<Character> stack = new Stack<>();
        //결과 출력 변수 생성
        StringBuilder sb = new StringBuilder();
        //한글자씩 검증 시작
        for (char now : token) {
            //연산자의 경우
            if (Operation.isOperation(now)) {
                //'(' 일경우 그냥 push'('이후에 쌓이는 것들이 ')'을 만났을 때 pop 될 구분점"
                if (now == '(') stack.push(now);
                //')'의 경우 ( 보다 늦게 쌓인 것들을 pop
                else if (now == ')') {
                    //우선 stack의 top을 pop
                    Character top = stack.pop();
                    //stack
                    while (!(top == '(')) {
                        sb.append(top);
                        top = stack.pop();
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
