using System;
using System.Collections.Generic;
public class Solution {
    public int[] solution(int n, int[] numlist) {
        List<int> a=new List<int>();
        for(int i=0; i<numlist.Length; i++)
        {
            if(numlist[i]%n==0)
            {
                a.Add(numlist[i]);
            }
        }
        return a.ToArray();
    }
}