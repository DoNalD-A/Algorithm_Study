package Baekjoon.Bronze.boj_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 소문자 'String' s 입력받기
         * 2. int[26]인 배열 선언하고, s.indexof()함수 사용
         * 3. 반복문으로 해당 인덱스에 값이 존재하면 설정하고, 없으면 -1 반환
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        int num = 97; //소문자 a

        //s.indexOf() -> 찾는 문자가 존재하지 않으면 (int)-1 반환
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.indexOf('a' + i);
            System.out.print(arr[i] + " ");
        }


    }
}