class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] answer = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            answer[i]=my_string.substring(i);
        }
        boolean tf=false;
        for(int i=0; i<answer.length; i++){
            if(answer[i].equals(is_suffix)) tf=true;
        }
        return tf?1:0;
    }
}