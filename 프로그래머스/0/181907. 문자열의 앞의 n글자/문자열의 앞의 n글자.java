class Solution {
    public String solution(String my_string, int n) {
        StringBuilder a=new StringBuilder();
        for(int i=0; i<n; i++){
            a.append(my_string.charAt(i));
        }
        return a.toString();
    }
}