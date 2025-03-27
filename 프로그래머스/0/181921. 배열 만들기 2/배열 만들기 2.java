class Solution {
    public int[] solution(int l, int r) {
        StringBuilder a = new StringBuilder();
        int m = 0;
        for (int i = l; i <= r; i++) {
            boolean tf=true;
            String k = Integer.toString(i);
            for(int j=0; j<k.length(); j++){
                if(k.charAt(j)!='5'&&k.charAt(j)!='0'){
                    tf=false;
                    break;
                }
            }
            if(tf){
                a.append(k).append(" ");
                m++;
            }
        }

        int[] answer;
        if (m == 0) {
            answer = new int[]{-1};
        } else {
            String[] b = a.toString().trim().split(" ");
            answer = new int[b.length];

            for (int i = 0; i < b.length; i++) {
                answer[i] = Integer.parseInt(b[i]);
            }
        }
        return answer;
    }
}