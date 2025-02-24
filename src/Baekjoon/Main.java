package Baekjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 문자열 'S' 입력받기
         * 2. 크기가 26(알파벳)인 배열 선언하여 각 문자 개수 세기
         **/


        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        // 2
        int[] alphaCount = new int[26];

        for (int i = 0; i < S.length(); i++) {
            int tmp = S.charAt(i);
            int index = 97;
            for (int j = 0; j < 26; j++) {
                if (tmp == index) {
                    alphaCount[j]++;
                    break;
                }
                index++;
            }
        }


        for (int i : alphaCount) {
            System.out.print(i + " ");
        }
    }
}
