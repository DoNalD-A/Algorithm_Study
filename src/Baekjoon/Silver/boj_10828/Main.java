package Baekjoon.Silver.boj_10828;

import java.io.*;
import java.util.*;

public class Main {
    private static ArrayList<Integer> stack = new ArrayList<>();
    private static int currentIndex = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("push")) {
                int pushNum = Integer.parseInt(st.nextToken());
                push(pushNum);
            } else if (order.equals("pop")) {
                pop();
            } else if (order.equals("size")) {
                size();
            } else if (order.equals("empty")) {
                empty();
            } else if (order.equals("top")) {
                top();
            }
        }
    }

    private static void push(int pushNum) {
        stack.add(pushNum);
        currentIndex++;
    }

    private static void pop() {
        if (stack.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(stack.get(currentIndex));
            stack.remove(currentIndex);
            currentIndex--;
        }
    }

    private static void size() {
        System.out.println(stack.size());
    }

    private static void empty() {
        if (stack.isEmpty()) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private static void top() {
        if (stack.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(stack.get(currentIndex));
        }
    }
}
