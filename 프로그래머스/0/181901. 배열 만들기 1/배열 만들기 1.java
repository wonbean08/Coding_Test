import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> a=new ArrayList<>();
        for(int i=k; i<=n; i++){
            if(i%k==0) a.add(i);
        }
        int[] answer=new int[a.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=a.get(i);
        }
        return answer;
    }
}