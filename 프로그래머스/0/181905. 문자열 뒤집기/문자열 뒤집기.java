class Solution {
    public String solution(String str, int s, int e) {
        StringBuilder a=new StringBuilder(str.substring(s,e+1));
        return str.substring(0,s) + a.reverse().toString() + str.substring(e+1, str.length());
        //return a;
    }
}