using System;

public class Solution {
    public int solution(int n, int k) {
        int a=n/10;
        return 12000*n+2000*(k-a);
    }
}