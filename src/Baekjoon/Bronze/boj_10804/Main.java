package Baekjoon.Bronze.boj_10804;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 크기 20인 배열 배열에 값 초기화
         * 2. 두 수를 입력받아 순서를 입력받아 두 수의 차이 크기의 배열 선언
         * 3. tmp[두 수 크기 차이]에 값 역순으로 받고 값 수정 후 배열 반환
         * 4. 코드의 가독성을 위해 함수만 따로 분리
         * ** Scanner의 nextInt()는 개행문자를 기준으로 토큰을 입력 받는다
         * ** Scanner를 Main에서 선언하고 다른 메서드에서 사용하려면 Scanner도 매개변수로 넣어줘야함*/

        // 1
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        Scanner sc = new Scanner(System.in);

        // 4
        for (int i = 0; i < 10; i++) {
            numChange(arr, sc);
        }
        sc.close();

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static int[] numChange(int[] arr, Scanner sc) {
        // 2
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] tmp = new int[B - A + 1];

        // 3
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = arr[B - i - 1];
        }
        for (int i = 0; i < tmp.length; i++) {
            arr[A + i - 1] = tmp[i];
        }
        return arr;
    }
}
