import java.util.Scanner;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(i<s){
                answer+=my_string.charAt(i);
            }
            else if(i>=s && i<s+overwrite_string.length()){
                answer+=overwrite_string.charAt(i-s);
            }
            else if(i<my_string.length() && i>=s+overwrite_string.length()){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        solution(sc.next(), sc.next(), sc.nextInt());
    }
}