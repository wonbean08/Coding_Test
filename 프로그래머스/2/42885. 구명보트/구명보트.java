import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int k=people.length-1;
        Arrays.sort(people);  
        for(int i=0; i<=k;){
            if(people[i]+people[k]<=limit){
                i++;
            }
            k--;
            answer++;
        }
        return answer;
    }
}