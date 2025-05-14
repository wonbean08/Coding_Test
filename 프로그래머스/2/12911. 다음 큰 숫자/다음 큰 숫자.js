function solution(n) {
    var answer = n+1;
    var k=n.toString(2);
    var len=k.split('1').length -1
    while(true){
        var binarynum=(answer.toString(2)).toString();
        if(binarynum.split('1').length -1==len){
            break;
        }
        answer++;
    }
    return answer;
}