import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer="";
        Arrays.sort(indices);
        int k=0;
        for(int i=0; i<my_string.length(); i++){
            if(k<indices.length && i==indices[k]){
                k++;
                continue;
            }
            else answer+=my_string.charAt(i);
        }
        return answer;
    }
}