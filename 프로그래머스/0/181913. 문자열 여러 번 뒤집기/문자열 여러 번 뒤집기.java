class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        char temp=' ';
        for(int i=0; i<queries.length; i++){
            int a=queries[i][0];
            int b=queries[i][1];
            for(int j=0; j<=(b-a)/2; j++){
                temp=arr[a+j];
                arr[a+j]=arr[b-j];
                arr[b-j]=temp;
            }
        }
        String answer=String.valueOf(arr);
        return answer;
    }
}