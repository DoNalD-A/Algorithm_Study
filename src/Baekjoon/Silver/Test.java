package Baekjoon.Silver;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i < 32; i++) {
            System.out.print(i + "번째 값 입력: ");
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}
