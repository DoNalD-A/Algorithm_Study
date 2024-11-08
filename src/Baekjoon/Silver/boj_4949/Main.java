package Baekjoon.Silver.boj_4949;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * 1. while(true) -> 문자열 S 입력받고 '.'이면 종료
         * 2. Stack<Character> 선언 메서드를 사용할 예정이라 Character 타입
         * 3. '(', '[' -> push / ')',']' -> 확인해보기
         * 4. 종료 조건('.')을 만나면 스택 비어있는지 && isBalanced 학인
         *
         * 즉 '(', '[' -> 무조건 push
         *    ')', ']' -> 비어있는지 확인 + pop() (stack안에는 '(','['만 존재하기 때문에)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1
        while (true) {
            String S = br.readLine();
            if (S.equals(".")) break;

            // 2
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            // 3
            for (int i = 0; i < S.length(); i++) {
                char currentChar = S.charAt(i);
                if (currentChar == '.') break;

                if (currentChar == '(' || currentChar == '[') {
                    stack.push(currentChar);
                } else if (currentChar == ')') {
                    if (stack.isEmpty() || (stack.pop() != '(')) {
                        isBalanced = false;
                        break;
                    }
                } else if (currentChar == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isBalanced = false;
                        break;
                    }
                }
            }

            if (isBalanced && stack.empty()) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }


        }
    }
}
