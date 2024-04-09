package programers;

public class Lessons12980 {

    public int solution(int n) {
        int ans = 0;

        while(n > 0){
            if (n % 2 == 0){ //거리가 짝수일 때는 순간이동
                n /= 2;
            }else{
                n--;
                ans++;
            }
        }

        return ans;
    }
}
