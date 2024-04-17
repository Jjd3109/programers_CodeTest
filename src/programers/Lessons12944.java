package programers;

import java.util.Arrays;

public class Lessons12944 {

    public double solution(int[] arr) {
        double answer = 0;

        //arr의 평균값을 내시오.......
        for(int j : arr){
            answer += j;
        }

        return answer / arr.length;
    }
}
