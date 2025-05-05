package Baekjoon.Silver.boj_1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= X; i <<= 1) { // i를 비트 연산으로 2배수씩 증가
            if ((i & X) == i) // i와 X를 AND 연산을 해서 i가 X에 포함되어 있는지 확인
                count++;
        }
        System.out.println(count);
    }
}