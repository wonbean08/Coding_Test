class Solution {
    public int solution(int n) {
        int answer = 0;
        int pre=0;
        int k=1;
        for(int i=0; i<n-1; i++){ 
            answer=(k+pre)%1234567;
            pre=k%1234567;
            k=answer%1234567;
        }
        //answer=Math.round(answer%1234567);
        return answer%1234567;
    }
}