public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String temp="";
        for(int i=0; i<intStrs.length; i++){
            String a="";
            for(int j=s; j<l+s; j++){
                a+=intStrs[i].charAt(j);
            }
            if(!a.isEmpty()&&Integer.parseInt(a)>k) temp=temp.concat(a).concat(" ");
        }
        
        String[] str=temp.trim().split(" ");
        int[]answer=new int[str.length];
        for(int i=0; i<answer.length; i++){
            answer[i]=Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}