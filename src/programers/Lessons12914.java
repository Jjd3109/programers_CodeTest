package programers;

public class Lessons12914 {

    public long solution(int n) {
        final int MOD = 1234567;

        // 초기값 설정
        long prev = 1;
        long curr = 2;

        // 동적 계획법을 사용하여 dp 배열 채우기

        if(n == 1){
            return 1 % MOD;
        }

        for (int i = 3; i <= n; i++) {
            long next = (prev + curr) % MOD;
            prev = curr;
            curr = next;
        }

        // 결과 반환
        return curr;
    }
}
