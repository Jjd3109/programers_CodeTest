package programers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lessons12981 {

    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0}; // 결과 배열 초기화

        // 1. 끝말잇기 진행에 필요한 변수들 선언 및 초기화
        Set<String> usedWords = new HashSet<>();
        char lastChar = words[0].charAt(0);
        int turn = 1; // 사람의 순서
        int round = 1; // 라운드

        // 2. 끝말잇기 진행
        for (String word : words) {
            // 2-1. 현재 단어가 유효한지 확인
            if (word.length() < 2 || usedWords.contains(word) || word.charAt(0) != lastChar) {
                // 위 조건 중 하나라도 만족하면, 해당 사람이 탈락하게 됨
                answer[0] = turn; // 탈락한 사람의 번호
                answer[1] = round; // 탈락한 사람의 차례
                break;
            }

            // 2-2. 현재 단어를 사용한 것으로 표시하고, 다음 사람의 순서와 라운드를 조정
            usedWords.add(word);
            lastChar = word.charAt(word.length() - 1);
            turn = (turn % n) + 1; // 다음 사람의 순서 계산
            if (turn == 1) round++; // 라운드가 끝날 때마다 증가
        }

        return answer;
    }


}
