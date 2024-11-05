package Baekjoon.Silver.boj_1764;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * 1. A를 입력받아 HashSet에 저장
         * 2. B를 입력받을 때 HashSet과 비교하여 겹치면 commonWord 리스트에 저장
         * 3. commonWord크기와, 정렬된 commonWord 출력
         */

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<String> aHash = new HashSet<>();
        for (int i = 0; i < A; i++) {
            aHash.add(br.readLine());
        }

        // 2
        ArrayList<String> commonWord = new ArrayList<>();
        for (int i = 0; i < B; i++) {
            String tmp = br.readLine();
            if (aHash.contains(tmp)) {
                commonWord.add(tmp);
            }
        }

        // 3
        commonWord.sort(Comparator.naturalOrder());
        System.out.println(commonWord.size());
        for(String s : commonWord){
            System.out.println(s);
        }

    }
}
