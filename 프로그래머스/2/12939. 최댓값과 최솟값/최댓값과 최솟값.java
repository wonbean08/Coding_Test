class Solution {
    public String solution(String s) {
        String a="";
        String[] answer =s.split(" ");
        int n=0;
        int max = Integer.parseInt(answer[0]);
        int min = Integer.parseInt(answer[0]);

        for (int i = 1; i < answer.length; i++) {
            n=Integer.parseInt(answer[i]);
            if (n>max) {
                max = Integer.parseInt(answer[i]);
            }
            if (n<min) {
                min = Integer.parseInt(answer[i]);
            }
        }
        
        return a.concat(Integer.toString(min)).concat(" ").concat(Integer.toString(max));
    }
}