package Baekjoon.Bronze.boj_1259;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 문자열을 입력받아 for문으로 length()/2 까지 순환 -> if문으로 양 쪽 끝이 맞는지 확인
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();

        while (!tmp.equals("0")) {
            boolean isPal = true;
            for (int i = 0; i < tmp.length() / 2; i++) {
                if (tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i)) {
                    isPal = false;
                    break;
                }
            }
            if (isPal) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            tmp = br.readLine();
        }
    }
}
