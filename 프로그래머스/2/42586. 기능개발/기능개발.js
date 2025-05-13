function solution(progresses, speeds) {
    let answer = [];

    for(let i=0; i<progresses.length; i++) {
        let a=Math.ceil((100-progresses[i])/speeds[i]);
        answer.push(a);
    }

    let count=0;
    let realAnswer = [];
    let cnt=answer[0];
    
    for(let i=0; i<answer.length; i++){
        if(cnt<answer[i]){
            realAnswer.push(count);
            count=1;
            cnt=answer[i];
        }else{
            count++;
        }
    }
    
    realAnswer.push(count);
    return realAnswer;
}