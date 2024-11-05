package Baekjoon.Silver.boj_1316;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 입력 받을 단어 개수 N 입력 받기
         * 2. String word 단어 입력받고, 중복 확인할 Hashset, 현재 문자 가리키는 prevChar 선언
         * 3. prevChar과 currentChar 비교 같으면 넘어가기, 다르면 Hashset에 있는지 확인
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        // 2
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            HashSet<Character> set = new HashSet<>();
            char prevChar = word.charAt(0);
            set.add(prevChar);
            boolean isGroupWord = true;

            for (int j = 1; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                if (prevChar != currentChar) {
                    if (set.contains(currentChar)) {
                        isGroupWord = false;
                        break;
                    }else{
                        set.add(currentChar);
                        prevChar = currentChar;
                    }
                }
            }
            if (isGroupWord) {
                count++;
            }
        }
        System.out.println(count);

    }
}
