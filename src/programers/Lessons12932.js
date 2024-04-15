function solution(n) {
    var answer = [];

    var i;
    for(i = n.length; i > 0; i--){
        console.log(n[i]);
        answer.push(n[i]);
    }

    return answer;
}