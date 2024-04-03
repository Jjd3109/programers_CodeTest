package programers;

import java.util.HashSet;
import java.util.Set;

public class Lessons1845 {
    public int solution(int[] nums) {
        int answer = 0;

        //take 가져 갈수 있는
        int take = nums.length / 2;

        //set을 이용한 중복 방지
        Set<Integer> setNums = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            setNums.add(nums[i]);
        }


        if (setNums.size() < take) {
            return setNums.size();
        } else {
            return take;
        }

    }


}
