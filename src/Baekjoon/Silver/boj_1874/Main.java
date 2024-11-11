package Baekjoon.Silver.boj_1874;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int currentNum = 0;
        StringBuilder result = new StringBuilder(); // 출력 결과 저장용

        boolean isPossible = true;

        for (int i = 0; i < N; i++) {
            int order = Integer.parseInt(br.readLine());

            if (currentNum < order) { // 필요한 값까지 stack에 push
                while (currentNum < order) {
                    currentNum++;
                    stack.push(currentNum);
                    result.append("+\n");
                }
            }

            // order와 스택의 top이 같은지 확인 후 pop
            if (!stack.isEmpty() && stack.peek() == order) {
                stack.pop();
                result.append("-\n");
            } else { // 불가능한 수열인 경우
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(result);
        } else {
            System.out.println("NO");
        }
    }
}

