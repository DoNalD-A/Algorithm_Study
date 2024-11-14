package Baekjoon.Silver.boj_2164;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 카드의 개수 N 입력받기 + 큐 선언하고 값 추가
         * 2. 제일 위 버리고, 그 다음 나오는 카드 제일 밑으로 넣기 반복
         * 3. 1장 남을 때의 숫자 구하기
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 2
        while (queue.size() > 1) {
            queue.poll();
            if (queue.peek() != null) {
                queue.offer(queue.poll());
            }
        }
        System.out.println(queue.poll());


    }
}


