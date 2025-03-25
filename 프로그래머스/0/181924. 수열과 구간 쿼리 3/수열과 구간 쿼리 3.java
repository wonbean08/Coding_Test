class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int a=0;
        int m=0; 
        int n=0;
        for(int i=0; i<queries.length; i++){
            n=queries[i][0];
            m=queries[i][1];
            a=arr[n];
            arr[n]=arr[m];
            arr[m]=a;
        }
        return arr;
    }
}