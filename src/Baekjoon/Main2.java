package Baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            System.out.println(showResult(sum));

        }
    }

    private static String showResult(int sum) {
        if (sum == 0) {
            return "D";
        } else if (sum == 1) {
            return "C";
        } else if (sum == 2) {
            return "B";
        } else if (sum == 3) {
            return "A";
        } else if (sum == 4) {
            return "E";
        } else {
            return "다시 입력하시오. ";
        }

    }
}
