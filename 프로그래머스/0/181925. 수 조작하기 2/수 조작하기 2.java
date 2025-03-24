class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for(int k=1; k<numLog.length; k++){
            int i=numLog[k]-numLog[k-1];
            answer.append(i==1?"w":i==-1?"s":i==10?"d":i==-10?"a":"");
        }
        return answer.toString();
    }
}