class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i=0; i<index_list.length; i++){
            int k=index_list[i];
            answer+=String.valueOf(my_string.charAt(k)) ;
        }
        return answer;
    }
}