class Solution {
    public String solution(String str1, String str2) {
        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();
        StringBuilder answer=new StringBuilder();
        for(int i=0; i<a.length; i++){
            answer.append(a[i]).append(b[i]);
        }
        return answer.toString();
    }
}