class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd=new StringBuilder();
        StringBuilder even=new StringBuilder();
        for(int num:num_list){
            (num%2==1?odd:even).append(num);
        }
        return Integer.parseInt(odd.toString())+Integer.parseInt(even.toString());
    }
}