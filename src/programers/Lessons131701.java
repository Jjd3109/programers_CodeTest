package programers;

import java.util.HashSet;
import java.util.Set;

public class Lessons131701 {

    public int solution(int[] elements) {
        int answer = 0;
        //길이가 1인 연속 부분 수열로부터 1,4,7,9 ... 값을 전부 구한다음에 Set을 하면 된다!

        Set<Integer> oneValue = new HashSet<Integer>();


        for(int i = 1; i<=elements.length; i++){

            for(int j = 0; j<=elements.length; j++){
                int sum = 0;

                for(int k = j; k< j+i; k++){
                    sum+=elements[k%elements.length];
                }
                oneValue.add(sum);
            }
        }
        answer = oneValue.size();


        return answer;
    }
}
