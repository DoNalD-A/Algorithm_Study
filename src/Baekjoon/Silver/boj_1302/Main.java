package Baekjoon.Silver.boj_1302;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * 1. HashMap에 책들 입력받기 (int max로 max value값 갱신)
         * 2. value = max 인 key값들 ArrayList에 저장
         * 3. ArrayList 정렬하여 첫번째 값 출력
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book,0) +1);
            if (max <= map.get(book)) {
                max = map.get(book);
            }
            //max = Math.max(max, map.get(book));
        }

        // 2
        List<String> targetValue = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                targetValue.add(entry.getKey());
            }
        }

        // 3
        targetValue.sort(Comparator.naturalOrder());
        System.out.println(targetValue.get(0));

    }
}
