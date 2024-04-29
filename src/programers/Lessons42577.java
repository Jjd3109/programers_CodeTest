package programers;

import java.util.HashMap;

public class Lessons42577 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;


        HashMap<String, Integer> map = new HashMap<>();

        for (String number : phone_book) {
            map.put(number, 1);
        }

        // 각 전화번호의 접두사를 구하여 해시맵에서 찾기
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                String prefix = number.substring(0, i);
                if (map.containsKey(prefix)) {
                    return false;
                }
            }
        }


        return answer;
    }
}
