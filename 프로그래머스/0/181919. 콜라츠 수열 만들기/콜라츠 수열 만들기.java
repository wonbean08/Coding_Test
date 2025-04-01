class Solution {
    public int[] solution(int n) {
        int count=0;
        int nn=n;
        while(nn!=1){
            nn=(nn%2==0)?(nn/2):(3*nn+1);
            count++;
        }
        int[]answer=new int[count+1];
        answer[0]=n;
        
        int k=1;
        int temp=n;
        while(temp!=1){
            temp=(temp%2==0)?(temp/2):(3*temp+1);
            answer[k]=temp;
            k++;
        }
        return answer;
    }
}