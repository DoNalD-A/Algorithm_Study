package Baekjoon.Bronze.boj_1157;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 문자열 S 입력받아 모두 대문자로 바꾸기
         * 2. int[26]인 배열(index 0 == 'A') 선언하여 값 넣기
         * 3. max값 출력(boolean으로 중복이면 '?' 출력
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Stmp = br.readLine();
        String S = Stmp.toUpperCase();

        // 2
        int[] arrCount = new int[26];
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'A';
            arrCount[index] += 1;
        }

        //3
        int max = -1;
        int maxIndex = -1;
        boolean isDuplicate = false;
        for (int i = 0; i < arrCount.length; i++) {
            if (arrCount[i] > max) {
                max = arrCount[i];
                maxIndex = i;
                isDuplicate = false;
            } else if (arrCount[i] == max) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            System.out.println('?');
        }else{
            System.out.println((char) (maxIndex + 65));
        }



    }
}
