package Baekjoon.Silver.boj_9012;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * 1. 문자열 개수 N 입력받고 N번 for문 선언
         * 2. String tmp 입력받고, Stack선언하고,  for문으로 tmp 읽기
         * 3. '(' -> push, ')' -> 스택이 비어있으면 break;, 아니면 pop()
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {

            // 2
            String tmp = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;
            for (int j = 0; j < tmp.length(); j++) {
                // 3
                char currentChar = tmp.charAt(j);
                // '('인 경우
                if (currentChar == '(') {
                    stack.push(currentChar);
                }
                // ')'인 경우
                else if (currentChar == ')') {
                    if (stack.empty()) {
                        isVPS = false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            if (stack.empty() && isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}