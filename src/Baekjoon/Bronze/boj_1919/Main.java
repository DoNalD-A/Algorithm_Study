package Baekjoon.Bronze.boj_1919;

import java.util.*;
import java.io.*;

public class Main {

    public static int[] addAlphabetSum(String str) {

        int[] countStr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            countStr[str.charAt(i) - 'a']++;
        }

        return countStr;
    }

    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int cnt = 0;

        int[] countStr1 = addAlphabetSum(str1);
        int[] countStr2 = addAlphabetSum(str2);

        for (int i = 0; i < 26; i++) {
            int compare = countStr1[i] - countStr2[i];
            if (compare != 0) cnt += Math.abs(compare);
        }

        System.out.println(cnt);
    }
}
