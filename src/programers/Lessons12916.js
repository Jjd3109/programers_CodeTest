function solution(s){
    var answer = true;

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    var i;
    var pValue = 0;
    var yValue = 0;

    s = s.toLowerCase();


    for (i = 0; i < s.length; i++) {
        if (s[i] === 'p') {
            pValue++;
        }

        if (s[i] === 'y') {
            yValue++;
        }
    }


    if (pValue !== yValue) {
        answer = false;
    }


    return answer;
}