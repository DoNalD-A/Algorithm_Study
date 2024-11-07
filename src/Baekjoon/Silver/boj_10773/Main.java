package Baekjoon.Silver.boj_10773;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * 1. 정수타입 Stack 선언하고, 정수 개수 N입력 받기
         * 2. if (0) -> pop / else -> push
         * 3. sum에 모두 더하기 (for each문 사용해도 된다)
         */

        // 1
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 2
            int order = Integer.parseInt(br.readLine());
            if (order == 0) {
                stack.pop();
            }else{
                stack.push(order);
            }
        }
        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        System.out.println(sum);

    }
}
