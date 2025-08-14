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
                    //stack의 top이 '(' 가 나올 때까지 반복
                    while (!(top == '(')) {
                        // pop 된 top의 경우 결과에 출력
                        sb.append(top);
                        // '('는 출력되지 않도록 출력 이후에 pop
                        top = stack.pop();
                    }
                // '(' 도 ')' 도 아닌 경우
                } else {
                    //stack이 비었으면 뭐든 상관 없이 push
                    if (stack.empty())
                        stack.push(now);
                    else {
                        //stack이 비지 않았으면 자신보다 레벨이 같거나 높은 op를 모두 pop
                        // + 보다 레벨이 높은 *, /, 레벨이 같은 + - 모두 pop
                        while (!stack.empty() && Operation.isOrder(now, stack.peek())) {
                            sb.append(stack.pop());
                        }
                        // 모두 pop을 한 뒤 now를 push
                        stack.push(now);
                    }
                }
            // 피연산인 경우 바로 출력
            } else {
                sb.append(now);
            }
        }

        // 입력에 대한 처리가 끝난 이후 stack을 비워줌
        while(!stack.empty()) {
            sb.append(stack.pop());
        }

        //결과 출력
        System.out.print(sb);
    }


    //연산자에 대한 정보를 처리
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

        //특정 Char가 Operation 인지 피연산자인지 구분
        public static boolean isOperation(char ch){
            return operationLevel.containsKey(ch);
        }

        //연산자끼리의 비교에서 레벨 수준 비교
        //pop 해야하는 경우 어디까지 pop을 할지 정하게 됨
        //pop하는 기준은 자기 보다 우선순위가 높거나 같은 경우 까지.
        public static boolean isOrder(char a, char b){
            return operationLevel.get(a) <= operationLevel.get(b);
        }
    }
}
