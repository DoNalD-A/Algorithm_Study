package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solving {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 정수가 10줄 주어진다
         * 2. 각 정수를 42로 나눈 나머지를 배열 int[] arr = int[42] 에 index += 1 해준다
         * 3. 42 - (arr 배열 중 값이 0인 갯수)를 출력한다
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int tmp = Integer.parseInt(br.readLine());
            int tmp_index = tmp % 42;

            if(arr[tmp_index] == 0){
                arr[tmp_index] = 1;
                count++;
            }
        }

//        int zeroSum = 0;
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] == 0) {
//                zeroSum += 1;
//            }
//        }

        System.out.println(count);


    }
}