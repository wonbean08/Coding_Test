class Solution {
    public String solution(String str, int m, int c) {
        StringBuilder a=new StringBuilder();
        for(int i=c-1; i<str.length(); i+=m){
            a.append(str.charAt(i));
        }
        return a.toString();
    }
}