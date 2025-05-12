package programmers.Lv0.문자열돌리기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
        int count = 0;

        for (int i = 0; i < tmp.length(); i++) {
            System.out.println(tmp.charAt(count));
            count++;
        }

    }
}