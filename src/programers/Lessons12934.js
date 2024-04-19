function solution(n) {
    var answer = 0;
    var i = 2;
    var value = 0;

    while(value >= n){
        i ++;

        value = i * i;

    }
    console.log(i);
    console.log(value);

    if(value == n){
        return (i + 1) * (i + 1);
    }


    return -1;
}