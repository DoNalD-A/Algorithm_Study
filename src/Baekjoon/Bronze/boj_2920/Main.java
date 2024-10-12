package Baekjoon.Bronze.boj_2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. String S 입력받기
         * 2. 공백을 기준으로 배열로 분리하기(?)
         * 3. 각 값의 차이로 3가지(-7, 7, 그 외)로 분류
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] sArray = s.split(" ");
        int[] iArray = new int[sArray.length];

        //int형 배열로 바꾸기
        for (int i = 0; i < sArray.length; i++) {
            iArray[i] = Integer.parseInt(sArray[i]);
        }

        boolean isAscending = true; // i+1 > i
        boolean isDescending = true;// i+1 < i

        for (int i = 1; i < iArray.length; i++) {
            if (iArray[i - 1] < iArray[i]) {
                isDescending = false;
            } else if (iArray[i - 1] > iArray[i]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}