package programers;

import java.util.ArrayList;

public class Lessons258707 {

    public int solution(int coin, int[] cards) {
        int answer = 0;

        ArrayList<Integer> user = new ArrayList<Integer>();

        //처음 user값 설정
        for(int i = 0; i < cards.length/3; i++){
            user.add(cards[i]);
        }

        user.add(cards[4]);
        user.add(cards[5]);


        int k = 0;
        while (k < user.size()) {
            for (int i = k + 1; i < user.size(); i++) {

                if ((cards.length + 1) == (user.get(i) + user.get(k))) {
                    user.remove(i);
                    user.remove(k);
                    answer++;
                    // 한 쌍을 찾았으므로 반복문 탈출
                    break;
                }
            }
            // 현재 k에 해당하는 요소와 맞는 쌍이 없다면 k를 증가시킴
            k++;
        }

        //값 2개 가져오기
        System.out.println(user);




        // System.out.println(user);

        // 2. 카드 두장 -> 카드 없으면 종료 && 카드는 동전 소모해 가지거나 소모하지 않고 버릴수 있음

        // 3. 카드에 적힌 수의 합이 n+1 되도록 카드 두장 내고 다음 라운드 && 못내면 종료


        return answer;
    }
}
